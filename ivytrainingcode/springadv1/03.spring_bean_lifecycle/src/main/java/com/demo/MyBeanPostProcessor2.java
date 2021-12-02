package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanPostProcessor2 implements BeanPostProcessor, Ordered{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization 2 is called..");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization 2 is called..");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	//smaller the no higher the priority
	@Override
	public int getOrder() {
		return 2;
	}

	
}

