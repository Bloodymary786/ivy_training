package com.customerapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployee() {
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		System.out.println("Employee is deleted...");
	}

	@Override
	public void update(int id, Employee employee) {
		
	}

	@Override
	public void addEmployee(Employee employee) {
	
	}

	@Override
	public Employee getById(int id) {
		return null;
	}

}
