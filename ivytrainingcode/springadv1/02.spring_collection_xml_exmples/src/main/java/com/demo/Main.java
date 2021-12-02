package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {

		//ClassPathXmlApplicationContext VS FileSystemXmlApplicationContext
		ApplicationContext ctx = new FileSystemXmlApplicationContext("c://data//demo.xml");

		Car car = (Car) ctx.getBean("car");

		car.travel();

//		Resource resource=new ClassPathResource("demo.xml");
//		BeanFactory ctx=new XmlBeanFactory(resource);

//		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
//		
//		Car car=(Car) ctx.getBean("car");
//		
//		car.travel();

	}
}
