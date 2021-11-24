package com.empapp.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.empapp.persistance.user.User;
import com.empapp.persistance.user.UserNotFoundException;
import com.empapp.service.UserService;
import com.empapp.service.UserServiceImpl;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService userService = new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			User user = userService.getByUserNameAndPassword(username, password);
			HttpSession httpSession=request.getSession();
			
			httpSession.setAttribute("user", user);
			
			response.sendRedirect("addemp.jsp");
		} catch (UserNotFoundException e) {
				response.sendRedirect("login.jsp?error=login failed");
		}
	}

}
