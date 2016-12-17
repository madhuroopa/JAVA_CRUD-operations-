package com.bvrit.addressbook.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UserLoginCheckFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("UserLoginCheckFilter init()");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hRequest =(HttpServletRequest)request;
		HttpServletResponse hResponse = (HttpServletResponse)response;
		HttpSession hs = hRequest.getSession();
		String username = (String)hs.getAttribute("sunm");
		
		if(username == null) {
			hResponse.sendRedirect("login.jsp?error = Please login again");
		}
		chain.doFilter(request, response);
	}
	public void destroy() {
		System.out.println("UserLoginCheckFilter destroy()");
	}

}
