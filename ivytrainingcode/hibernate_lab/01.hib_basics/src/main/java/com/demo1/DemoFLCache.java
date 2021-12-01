package com.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class DemoFLCache {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		// ---------session 1--------------
		Session session = factory.openSession();
		Customer customer = session.get(Customer.class, 2L);
		System.out.println(customer);
		session.close();

		// ---------session 2--------------
		Session session2 = factory.openSession();
		Customer customer2 = session2.get(Customer.class, 2L);
		System.out.println(customer2);
		session2.close();

		factory.close();
	}

}
