package com.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String location =null;
	private String companyName =null;
	
	public void init(ServletConfig config) throws ServletException {
		location=config.getInitParameter("location");
		companyName=config.getServletContext().getInitParameter("companyName");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(location);
		System.out.println(companyName);
	}

}
