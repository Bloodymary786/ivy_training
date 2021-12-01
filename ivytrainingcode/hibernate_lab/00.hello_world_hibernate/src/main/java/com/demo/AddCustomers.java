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

public class AddCustomers {

	public static void main(String[] args) throws ParseException {
		
		//SessionFactory: used to create session and it is a heavy object
			//it should follow singleton dp
		
		SessionFactory factory=HibernateFactory.getFactory();
		
		Session session=factory.openSession();
		
		SimpleDateFormat dateformate=new SimpleDateFormat("dd/MM/yyyy");
		Date date1=dateformate.parse("11/11/1978");
		
		Customer customer1=new Customer("ankit", "54964446", "ankit@gmail.com", date1);
		Customer customer2=new Customer("ekta", "54004446", "ekta@gmail.com", date1);
		Customer customer3=new Customer("raj", "56664446", "raj@gmail.com", date1);
		
		Customer customer4=new Customer("gunika", "54564006", "gunika@gmail.com", date1);
		
		
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			session.save(customer1);
			session.save(customer2);
			session.save(customer3);
			session.save(customer4);
			
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

