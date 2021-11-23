package com.empapp.persistance;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDaoHibImpl implements EmployeeDao {

	private SessionFactory sessionFactory;
	
	public EmployeeDaoHibImpl() {
		sessionFactory=HibernateSessionFactoroy.getSessionFactory();
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		Session session=sessionFactory.openSession();
		List<Employee> employees=session.
				createQuery("select e from Employee e", Employee.class).getResultList();
		session.close();
		return employees;
	}

	@Override
	public Employee getById(int eid) {
		Session session=sessionFactory.openSession();
		Employee employee=session.get(Employee.class, eid);
		session.close();
		if(employee==null)
			throw new EmployeeNotFoundException("emp with id " + eid +" is not found");
		
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try {
			tx.begin();
			session.save(employee);
			tx.commit();
		}catch(HibernateException ex) {
			ex.printStackTrace();
		}
		session.close();
	}

	@Override
	public void deleteEmployee(int eid) {
		Employee employee=getById(eid);
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			session.delete(employee);
			tx.commit();
		}catch(HibernateException ex) {
			ex.printStackTrace();
		}
		session.close();
	}

	@Override
	public void updateEmployee(int eid, Employee employee) {
		Employee employeeToUpdate=getById(eid);
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			employeeToUpdate.setSalary(employee.getSalary());
			
			session.update(employeeToUpdate);
			
			tx.commit();
		}catch(HibernateException ex) {
			ex.printStackTrace();
			tx.rollback();
		}
		session.close();
	}

}
