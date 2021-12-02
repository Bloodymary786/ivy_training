package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * 	<context:annotation-config/>
	<context:component-scan base-package="com.demo2"/>
 */
@Configuration
@ComponentScan(basePackages = {"com.demo2"})
public class AppConfig {

}
