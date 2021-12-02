package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

	// @After vs @AfterReturning
	// @AfterReturning only get execute iff method executed successfully!
	// @After: it run dont mattter whether method exe successfully or not

	//Spring sec, tx mgt @Tranactional annotation 
	@Around("execution(public void doMagic())")
	public Object aroundAdEx(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("advice started....");
		//Object val = pjp.proceed();

		System.out.println("advice finished...");
		return null;
	}

//	@AfterReturning("execution(public void doMagic())")
//	public void clapping() {
//		System.out.println("wow, maza aa gaya!!");
//	}
// Spring mvc excption handing
	
//	@AfterThrowing("execution(public void doMagic())")
//	public void callDr() {
//		System.out.println("call Dr now I say Now !!");
//	}

}
