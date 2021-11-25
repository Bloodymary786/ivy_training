package com.empapp.persistance;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDaoHibImpl implements EmployeeDao {

	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//helper method
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return getSession().createQuery("select e from Employee e", Employee.class).getResultList();
	}

	@Override
	public Employee getById(int eid) {
		Employee employee= getSession().get(Employee.class, eid);
		if(employee==null)
			throw new EmployeeNotFoundException("emp with id "+ eid+ " is not found");
		return employee;
	}
	@Override
	public void addEmployee(Employee employee) {
		getSession().save(employee);	//:) tx decleative way
	}
	@Override
	public void deleteEmployee(int eid) {
		Employee employee=getById(eid);
		getSession().delete(employee);
	}
	@Override
	public void updateEmployee(int eid, Employee employee) {
		Employee employeeToUpdate=getById(eid);
		employeeToUpdate.setSalary(employee.getSalary());
		getSession().merge(employeeToUpdate);
	}
	@Override
	public Employee getByName(String ename) {
//		Employee employee=getSession()
//		.createQuery("select e from Employee e where e.ename=:name", Employee.class)
//		.setParameter("name", ename)
//		.getSingleResult();
//		if(employee==null) {
//			throw new EmployeeNotFoundException("employee with name "+ ename +" is not found");
//		return employee;
		
		List<Employee> employees=getSession()
				.createQuery("select e from Employee e where e.ename=:name", Employee.class)
				.setParameter("name", ename)
				.getResultList();
		
		if(employees.size()>0) {
			return employees.get(0);
		}else
			throw new EmployeeNotFoundException("employee with name "+ ename +" is not found");
		
	}
}



