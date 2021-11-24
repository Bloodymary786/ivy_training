package com.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name=null;
	public HelloServlet() {
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		name=config.getInitParameter("name");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(name);
	}

	@Override
	public void destroy() {

	}

}
