package com.backup2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		//AbstractApplicationContext vs ApplicationContext
		//AbstractApplicationContext alow to register something called "shutdown hook"
		//spring dont care for destruction of bean , 
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("foo.xml");
		ctx.registerShutdownHook();// spring will call fooDestroy iff u register registerShutdownHook
		System.out.println("----------------------");
		Foo f=(Foo) ctx.getBean("foo");
		
		f.doWork();
		f.doWork();
	}
}
