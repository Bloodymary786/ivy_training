package com.demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.bean.User;
import com.demo.dao.UserDao;
import com.demo.dao.UserDaoJdbcImpl;
import com.demo.dao.UserNotFoundException;

        

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao = new UserDaoJdbcImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			User user = userDao.getByUserNameAndPassword(username, password);
			HttpSession httpSession = request.getSession(true);

			httpSession.setAttribute("user", user);
			
			System.out.println(httpSession.getAttribute("user")); //Cross checking to obtained user object
			
			response.sendRedirect("menuController.do");
			
		} catch (UserNotFoundException ex) {
			response.sendRedirect("login.jsp?error=login failed");
		}
	}

}