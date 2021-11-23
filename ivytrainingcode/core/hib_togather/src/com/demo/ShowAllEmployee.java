package com.demo;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ShowAllEmployee {

	public static void main(String[] args) {
		SessionFactory factory=HibernateSessionFactoroy.getSessionFactory();
		//tx : No need 
		
		Session session=factory.openSession();
		
		//you need to get all emp rec, ORM ,sql<---> HQL(hibernate Q L) OO version of SQL
		
		List<Employee> employees=session
				.createQuery("select e from Employee e", Employee.class)
				.getResultList();
		
		for(Employee emp: employees) {
			System.out.println(emp);
		}
		
		session.close();
		factory.close();
	}
}
