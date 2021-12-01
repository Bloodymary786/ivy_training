package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetVsLoad {

	public static void main(String[] args) {
		//lazy and eager featching
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ivypu");
		
		EntityManager em=emf.createEntityManager();
	
		//Customer customer=em.getReference(Customer.class, 2);//getReference vs load is same
		Customer customer=em.find(Customer.class, 2);// find same as get : eager
		System.out.println("--------------------------");
		System.out.println(customer);
		em.close();
		emf.close();
	}
}
