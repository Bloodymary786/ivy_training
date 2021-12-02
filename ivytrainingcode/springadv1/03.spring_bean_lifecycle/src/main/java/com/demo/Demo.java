package com.demo;

import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("foo.xml");
		ctx.registerShutdownHook();
		
		Foo f=(Foo) ctx.getBean("foo");
		
		f.doWork();
		f.doWork();
	}
}
