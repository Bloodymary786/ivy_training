package com.app.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.persistence.User;
import com.app.persistence.UserNotFoundException;
import com.app.service.UserService;
import com.app.service.UserServiceImpl;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	UserService userService = new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		try {
			System.out.println("hii");
			User user = userService.getByNameAndPassword(name, password);
			
			System.out.println(user);
			HttpSession httpSession=request.getSession(true);
			
			httpSession.setAttribute("user", user);
			System.out.println(httpSession.getAttribute("user"));
			System.out.println("setting in session scope?");
			
			response.sendRedirect("loginsuccess.jsp");
		} catch (UserNotFoundException e) {
				response.sendRedirect("login.jsp?error=login failed");
		}
	}
}
