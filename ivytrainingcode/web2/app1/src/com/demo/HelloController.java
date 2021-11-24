package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//how to pass parameter to a servlet ? initparmater
	
	//u must have default ctr
	public HelloController() {
		System.out.println("i am a defualt ctr");
	}
	//ctr never call 
	public HelloController(int x) {
		System.out.println("i am para ctr");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("hello to ivy champs" + "<br/>");
		Date date = new Date();
		out.print(date + "<br/>");

	}
}
