package com.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class MySingleton{
	private MySingleton() {
		System.out.println("dare to call me");
	}
}
public class DemoCallingPrivateCtr {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//but u can call even a private method /ctr using java reflection
		//get the inforamtion of class
		
		Class class1=Class.forName("com.demo.MySingleton");
		
		Constructor[]constructors=class1.getDeclaredConstructors();
		constructors[0].setAccessible(true);
		
		MySingleton mySingleton= (MySingleton) constructors[0].newInstance();
		
		
	}
}
