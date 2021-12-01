package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateFactory;

public class GetVsLoad {

	public static void main(String[] args) {
		//lazy and eager featching
		
		SessionFactory factory=HibernateFactory.getFactory();
		
		Session session=factory.openSession();
		//get vs load: load will give u proxy object aka fake object (lazy loading of the data)?
		Customer customer=session.load(Customer.class, 2);
	
		System.out.println("-----------------------");
		session.close();
		//System.out.println(customer);
		//System.out.println(customer.getName()); //LazyInitializationException
		factory.close();
	}
}
