package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithSpringDI {
	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");

		Car car=(Car) ctx.getBean("car");
		car.move();
		
	}
}
