package com.demo.inh.single_table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;
import java.util.*;
public class DemoTester {

	public static void main(String[] args) {

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)

		session.getTransaction().begin();
		
//		Account account1=new SavingAccount("ravi", 5600, .4);
//		Account account2=new CurrentAccount("umesh", 5600, 400);
//		
//		session.save(account1);
//		session.save(account2);
		
		//it support poly quaries
//		
		List<Account> accounts=session.createQuery("select a from Account a", Account.class).getResultList();
	
		for(Account account: accounts) {
			System.out.println(account);
		}
		session.getTransaction().commit();
		

		session.close();

		factory.close();


	}

}
