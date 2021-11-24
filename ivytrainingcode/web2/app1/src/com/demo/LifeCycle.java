package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//persistance counter, db in servlet ?
	private int counter=0;
	public LifeCycle() {
		System.out.println("i am the ctr");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init method is called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		synchronized (this) {
			counter++;
		}
		PrintWriter out=response.getWriter();
		out.print(counter);
		System.out.println(" i am doget method ...");
	}

	@Override
	public void destroy() {
		System.out.println("destroy method is called");
	}

}
