package com.bookapp.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.BookAdviser;


@WebServlet("/SelectBook")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String topic=request.getParameter("topic");
		
		List<String>choices=BookAdviser.bookAdviser(topic);
		
		request.setAttribute("booklist", choices);
		
		RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
		
		rd.forward(request, response);

	}

}
