package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

	//Around advice
	@Around("execution(public void doMagic())")
	public Object clappingAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("beginging of around method ...");
		
		Object obj=joinPoint.proceed();
		
		System.out.println("end of around method ...");
		return obj;
	}
	
	//@Before("execution(public void doMagic())")
	//@After("execution(public void doMagic())")
	//@AfterReturning("execution(public void doMagic())")
//	public void clapping() {
//		System.out.println("clapping ... we enjoying the magic...");
//	}
//	@AfterThrowing("execution(public void doMagic())")
//	public void callDr() {
//		System.out.println("call the dr now...");
//	}
}
