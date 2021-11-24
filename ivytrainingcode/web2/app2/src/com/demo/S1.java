package com.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public S1() {
    	System.out.println("ctr of S1");
    }

    
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init of S1");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get method is called");
	}

}
