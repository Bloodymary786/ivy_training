package com.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListern implements ServletContextListener {

	//used to do somethig before anything can happen in ur web application
	//"it is mainly used to store some data into context scope so that any servlet jsp can access it"
    public void contextInitialized(ServletContextEvent sce)  {
    	//context vs config
    	sce.getServletContext().setAttribute("name", "raj");// global scope data 
        System.out.println("ctx initilized ....");
    }
	
   
    public void contextDestroyed(ServletContextEvent sce)  { 
    	  System.out.println("ctx destroyed ....");
    }

}
