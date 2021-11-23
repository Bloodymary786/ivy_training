package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AddEmployee {

	public static void main(String[] args) {
	
		SessionFactory factory = HibernateSessionFactoroy.getSessionFactory();
		
		Session session=factory.openSession();
		
		Employee employee=new Employee("umesh", 72);
		Employee employee2=new Employee("rajeev", 70);
		Employee employee3=new Employee("ekta", 80);
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			session.save(employee);
			session.save(employee2);
			session.save(employee3);
			
			
			tx.commit();
		}catch(HibernateException ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		
		session.close();
		factory.close();
		
	}
}













