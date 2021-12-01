package com.demo.factory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateFactory {
	private static SessionFactory factory=null;
	private HibernateFactory() {}
	
	public static SessionFactory getFactory() {
		StandardServiceRegistry serviceRegistry=
				new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		
		 factory=new MetadataSources(serviceRegistry).buildMetadata()
				.buildSessionFactory();
		 return factory;
	}
}
