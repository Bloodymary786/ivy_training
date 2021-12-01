package com.demo;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateFactory;

public class GetAllCustomers {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ivypu");
		
		EntityManager em=emf.createEntityManager();
		
		List<Customer> customers=em.createQuery("select c from Customer c", Customer.class).getResultList();
		for(Customer customer: customers) {
			System.out.println(customer);
		}
		
		em.close();
		emf.close();
		
		//printing names only
//		List<String> customers=session.createQuery("select c.name, c.phone from Customer c", String.class).getResultList();
//		for(String customer: customers) {
//			System.out.println(customer);
//		}
		
		//printing selected column only
//		List<CustomerData> customers=session.createQuery("select new com.demo.CustomerData (c.name, c.phone) from Customer c", CustomerData.class).getResultList();
//		for(CustomerData customerData: customers) {
//			System.out.println(customerData);
//		}
		
		//printing all customers on condition
//		List<Customer> customers=session.createQuery("select c from Customer c where c.name=:cname", Customer.class)
//				.setParameter("cname", "raj")
//				.getResultList();
//		for(Customer customer: customers) {
//			System.out.println(customer);
//		}
//		factory.close();
	}
}
