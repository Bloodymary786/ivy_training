package com.customerapp.service;

import java.util.List;

import com.customerapp.dao.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployee();
	public void deleteEmployee(int id);
	public void update(int id, Employee employee);
	public void addEmployee(Employee employee);
	public Employee getById(int id);
}
