package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithSpringDI {
	public static void main(String[] args) {

		//ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car=(Car) ctx.getBean("car");
		car.move();
		
	}
}
