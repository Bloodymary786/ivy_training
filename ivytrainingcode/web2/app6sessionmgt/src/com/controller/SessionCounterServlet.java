package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// session counter, cookies are used
		HttpSession httpSession = request.getSession();

		Integer counter = (Integer) httpSession.getAttribute("counter");

		if (counter == null) {
			counter = 1;
			httpSession.setAttribute("counter", counter);
			out.print("welcome first time user");

		} else {
			counter++;
			httpSession.setAttribute("counter", counter);
			out.print("welcome you have already visited :" + counter + " times");
		}

//		PrintWriter out=response.getWriter();
//		out.print("Session id:"+httpSession.getId()+"<br/>");
//		out.print("is session is new ? :"+httpSession.isNew()+"<br/>");
//		out.print("Session creation time:"+new Date(httpSession.getCreationTime())+"<br/>");
//		out.print("Session last access time:"+new Date(httpSession.getLastAccessedTime())+"<br/>");
//		out.print("Session inactive intervel:"+httpSession.getMaxInactiveInterval()+"<br/>");
//		

	}

}
