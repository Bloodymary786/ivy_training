package com.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	public String sayHello() default "good morning";
	public boolean isDone();
}


class MyClass{
	@MyAnnotation(sayHello = "good afternoon", isDone = false)
	public void doMethod() {
		System.out.println("do method....");
	}
}


public class DemoCustomAnnotation {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//i want to procee the annotation , i need to use java reflection
//		MyClass class1=new MyClass();
//		class1.doMethod();
		
		Class class1=Class.forName("com.demo.MyClass");
		
		Method[] methods=class1.getDeclaredMethods();
		
		for(Method method: methods) {
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation annotation=method.getAnnotation(MyAnnotation.class);
				System.out.println(annotation.sayHello()+", "+ annotation.isDone());
			}
		}
		
	}
}




