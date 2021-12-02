package com.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		///ApplicationContext ctx=new ClassPathXmlApplicationContext("demo2.xml");
		Car car=(Car) ctx.getBean("car");
		car.run();
	
	}
}
