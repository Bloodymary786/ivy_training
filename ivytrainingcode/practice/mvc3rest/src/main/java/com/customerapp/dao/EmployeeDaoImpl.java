package com.customerapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customerapp.dao.exceptions.EmployeeNotFoundException;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory factory;

	private Session getSession() {
		return factory.getCurrentSession();
	}
	@Autowired
	public EmployeeDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return getSession().createQuery("select e from Employee e", Employee.class).getResultList();
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee emp=getById(id);
		getSession().delete(emp);
		return emp;
	}

	@Override
	public Employee update(int id, Employee employee) {
		Employee emp=getById(id);
		emp.setSalary(employee.getSalary());
		getSession().update(emp);
		return emp;
	}

	@Override
	public Employee addEmployee(Employee employee) {
			getSession().save(employee);
			return employee;
	}

	@Override
	public Employee getById(int id) {
		Employee employee=getSession().get(Employee.class, id);
		if(employee==null)
			throw new EmployeeNotFoundException("emp with id "+ id +" is not found");
		return employee;
	}
}
