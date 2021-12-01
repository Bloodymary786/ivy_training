package com.demo;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class GetAllBooks {

	public static void main(String[] args) {
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		Session session=factory.openSession();
		
	
	}
}
