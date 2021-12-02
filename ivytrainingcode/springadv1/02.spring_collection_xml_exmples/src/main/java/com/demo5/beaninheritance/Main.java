package com.demo5.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demoInher.xml");
		Shape shape=(Shape) ctx.getBean("shape");
		
		//Shape shape2=(Shape) ctx.getBean("pshape");
		
		shape.printShape();
	}
}
