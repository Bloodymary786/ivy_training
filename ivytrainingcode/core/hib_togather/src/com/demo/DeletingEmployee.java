package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeletingEmployee {

	public static void main(String[] args) {
		SessionFactory factory=HibernateSessionFactoroy.getSessionFactory();
		Session session=factory.openSession();
		
		Transaction tx=session.getTransaction();
		
		try {
			tx.begin();
			//1. first u need to get that rec in memory
			Employee emp=session.get(Employee.class, 1);
			//2. remove it
			
			session.remove(emp);
			
			tx.commit();
			
		}catch(HibernateException ex) {
			ex.printStackTrace();
			tx.rollback();
		}
	}
}
