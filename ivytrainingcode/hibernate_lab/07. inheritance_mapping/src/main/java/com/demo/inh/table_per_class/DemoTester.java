package com.demo.inh.table_per_class;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class DemoTester {

	public static void main(String[] args) {

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)

		session.getTransaction().begin();

		List<Account> accounts = session.createQuery("select a from Account a",Account.class).getResultList();
//
		for(Account account: accounts) {
			System.out.println(account);
		}
//
//		Account account1=new SavingAccount("ekta", 5100, .4);
//		Account account2=new CurrentAccount("gunika", 5690, 400);
//		
//		session.save(account1);
//		session.save(account2);

		session.getTransaction().commit();

		session.close();

		factory.close();

	}

}
