package com.app.persistence;

import com.app.service.UserService;
import com.app.service.UserServiceImpl;

public class Demo {
	
	public static void main(String[] args) {
		UserService service=new UserServiceImpl();
		User user=service.getByNameAndPassword("rajiv", "raj123");
		System.out.println(user);
	}

}
