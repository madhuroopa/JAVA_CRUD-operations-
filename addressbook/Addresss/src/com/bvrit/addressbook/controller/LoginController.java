package com.bvrit.addressbook.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.bvrit.addressbook.beans.UserBean;
import com.bvrit.addressbook.dao.UserDAO;


public class LoginController extends HttpServlet {
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 try {
		//read user and password		
		String name = request.getParameter("user");
		String pwd = request.getParameter("password");
		boolean result = false;
		//creating ContactBean object with parameterized constructor
		UserBean uBean = new UserBean(name, pwd);
		UserDAO ud = new UserDAO();
		result = ud.validateUser(uBean);
		HttpSession hs = request.getSession();
		//add name as session attribute
		hs.setAttribute("sunm", name);
		AddressBookLog log = new AddressBookLog();
		log.write(name);
		
		if(result)
		{	
			response.sendRedirect("listcontact.jsp");									
			
		}
		else
		{
			response.sendRedirect("login.jsp");
			
		}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
