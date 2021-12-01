package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//pull : car is resp for pulling the dep of tyre :(
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Car car=(Car) ctx.getBean("car");
		car.run();
		
//		Tyre tyre=new CeatTyre();
//		
//		Car car=new Car();
//		car.setTyre(tyre);
//		car.setPassanger("raj");
//		car.run();
	}
}
