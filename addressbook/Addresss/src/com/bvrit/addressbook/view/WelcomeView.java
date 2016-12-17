package com.bvrit.addressbook.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class WelcomeView extends HttpServlet {
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//create printwriter object
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		        //get HTTP session reference
				HttpSession hs = request.getSession();
				//get user name from session
				String user = (String)hs.getAttribute("sunm");
				//String nm = request.getParameter("user");
				//print welcome message
		//		if(user != null) {
				   out.print("<marquee behavior= scroll direction= left ><h1>Welcome "+user+" to Address Book Application</h1></marquee>");
				   RequestDispatcher rd = request.getRequestDispatcher("link.html");
				   rd.include(request, response);
		//		}
		//		else {
		//			response.sendRedirect("login.jsp");
		//		}
			
	
	}
	
}
