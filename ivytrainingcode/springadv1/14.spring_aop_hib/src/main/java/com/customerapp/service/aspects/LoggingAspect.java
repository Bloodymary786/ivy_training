package com.customerapp.service.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Around("@annotation(com.customerapp.service.aspects.MyLogging)")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		
		Object result = pjp.proceed();//code to call target method
		
		long end = System.currentTimeMillis();

		logger.info("method take :" + (end - start) + " ms");
		return result;
	}
}
