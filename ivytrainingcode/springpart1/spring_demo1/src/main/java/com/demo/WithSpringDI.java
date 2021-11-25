package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithSpringDI {
	public static void main(String[] args) {
		//i need to use spring framework
		
		//ApplicationContext act as container
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		//by default spring follow singleton DP
		Car car=(Car) ctx.getBean("car");
		Car car2=(Car) ctx.getBean("car");
		System.out.println(car.getTyre().hashCode());
		System.out.println(car2.getTyre().hashCode());
		car.move();
		
	}
}
