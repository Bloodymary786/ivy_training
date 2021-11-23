package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DemoMain {

	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		// SessionFactory ?
		SessionFactory factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

		// Session

		Session session = factory.openSession();

		Transaction tx = session.getTransaction();

		try {
			
			tx.begin();
			
			Employee employee = new Employee("anil", 50);
			session.save(employee);

			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
		}

		session.close();

		factory.close();

	}
}
