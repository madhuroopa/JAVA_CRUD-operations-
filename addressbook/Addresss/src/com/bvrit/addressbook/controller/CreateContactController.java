package com.bvrit.addressbook.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bvrit.addressbook.beans.ContactBean;
import com.bvrit.addressbook.dao.*;

public class CreateContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			doProcess(request, response);
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			doProcess(request, response);
		}
		protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			try {
			// reading id,name,email,phone from request
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String phno = request.getParameter("phno");
			//reading user from session
			HttpSession hs = request.getSession();
			String user = (String) hs.getAttribute("sunm");
			//creating ContactBean object with parameterized constructor
			ContactBean cbean = new ContactBean(id, name, email, phno, user);
			//creating ContactDAO object
			ContactDAO contd = new ContactDAO();
			//calling addContact() method
			int result = contd.addContact(cbean);
            //redirecting response
			if(result == 1)
			{
				response.sendRedirect("listcontact.jsp");									
				
			}
			else
			{
				response.sendRedirect("createcontact.jsp");
				
			}
			}
			catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		}
	}
