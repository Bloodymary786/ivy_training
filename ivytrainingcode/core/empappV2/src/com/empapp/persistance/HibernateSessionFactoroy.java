package com.empapp.persistance;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactoroy {
 private static SessionFactory factory=null;
 
 private HibernateSessionFactoroy() {}
 
 public static SessionFactory getSessionFactory() {
  StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
    .build();
  // SessionFactory ?
   factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
  return factory;
 }
}
