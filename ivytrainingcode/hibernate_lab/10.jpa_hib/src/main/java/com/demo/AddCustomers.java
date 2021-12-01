package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddCustomers {

	public static void main(String[] args) throws ParseException {
		
		//SessionFactory vs EntityManagerFactory
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ivypu");
		
		//EntityManager vs Session
		EntityManager em=emf.createEntityManager();
		
		//Transaction vs EntityTransaction
		
		SimpleDateFormat dateformate=new SimpleDateFormat("dd/MM/yyyy");
		Date date1=dateformate.parse("11/11/1978");
		
		Customer customer1=new Customer("ankit", "54964446", "ankit@gmail.com", date1);
		Customer customer2=new Customer("ekta", "54004446", "ekta@gmail.com", date1);
		Customer customer3=new Customer("raj", "56664446", "raj@gmail.com", date1);
		
		Customer customer4=new Customer("gunika", "54564006", "gunika@gmail.com", date1);
		
		EntityTransaction tx= em.getTransaction();
		
		try {
			tx.begin();
			//save vs persist method
			em.persist(customer1);
			em.persist(customer2);
			em.persist(customer3);
			em.persist(customer4);

			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
	}
}

