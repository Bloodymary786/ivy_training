package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanPostProcessor1 implements BeanPostProcessor, Ordered{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization 1 is called..");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization 1 is called..");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public int getOrder() {
		return 1;
	}

	
}
