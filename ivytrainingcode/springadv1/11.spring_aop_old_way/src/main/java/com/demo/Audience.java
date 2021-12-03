package com.demo;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class Audience implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("before magician start the magic....");
		Object val= invocation.proceed();
		System.out.println("after magician done the magic....");
		return val;
	}


	
}



//public class Audience implements AfterReturningAdvice{
//
//	@Override
//	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
//		System.out.println("after return advice...");
//	}
//	
//}
//public class Audience implements MethodBeforeAdvice{
//	@Override
//	public void before(Method method, Object[] args, Object target) throws Throwable {
//		System.out.println("clapping ... we enjoying the magic...");
//	}
//}