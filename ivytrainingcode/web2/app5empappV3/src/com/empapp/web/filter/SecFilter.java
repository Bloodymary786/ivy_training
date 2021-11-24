package com.empapp.web.filter;

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

import com.empapp.persistance.user.User;

public class SecFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		// if u are logged in then u are welcome else please login

		boolean loggedIn = false;

		HttpSession httpSession = req.getSession(false);
		if (httpSession != null) {
			User user = (User) httpSession.getAttribute("user");
			if (user != null) {
				loggedIn = true;// my assumption was wrong he is a valid user
			}
		}
		if (loggedIn)
			chain.doFilter(request, response);
		else
			res.sendRedirect("login.jsp?error=login please");
	}

	public void destroy() {

	}

}
