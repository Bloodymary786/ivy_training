package com.productapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//this class is a bootstrap class loaded automatically by tomcat
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("beans for root app scope");
		return new Class[] {ModelConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("beans for web app scope");
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
