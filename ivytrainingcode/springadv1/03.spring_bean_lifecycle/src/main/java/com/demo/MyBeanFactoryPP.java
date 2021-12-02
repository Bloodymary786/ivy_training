package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//u have all the power to even change the config of bean before contain can give u 
		
		BeanDefinition beanDefinition=beanFactory.getBeanDefinition("foo");
		
		MutablePropertyValues mutablePropertyValues=beanDefinition.getPropertyValues();
		
		mutablePropertyValues.add("fooVal", "new foo value !");
		
		System.out.println("MyBeanFactoryPP postProcessBeanFactory is called");
	}

}
