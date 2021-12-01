package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.demo.factory.HibernateFactory;

public class DeleteCustomers {

	public static void main(String[] args) throws ParseException {
		
		//SessionFactory: used to create session and it is a heavy object
			//it should follow singleton dp
		
		SessionFactory factory=HibernateFactory.getFactory();
		
		Session session=factory.openSession();
		
		
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			
			Customer customer=session.get(Customer.class, 1);
			if(customer!=null) {
				session.delete(customer);
			}
			
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		System.out.println("---------------------------");
		factory.close();
		
		//Session
	}
}

