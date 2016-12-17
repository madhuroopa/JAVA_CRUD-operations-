package com.bvrit.addressbook.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.bvrit.addressbook.dao.ContactDAO;

public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		// reading id
		String id = request.getParameter("id");
		//creating ContactDAO object
		ContactDAO ud = new ContactDAO();
		//calling delete() method
		int result = ud.delete(id);
		//calling addContact() method
		if(result>=1){
			response.sendRedirect("listcontact.jsp?message=Record Deleted");}
		else{
			response.sendRedirect("listcontact.jsp?message=Record Not Deleted");}
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
