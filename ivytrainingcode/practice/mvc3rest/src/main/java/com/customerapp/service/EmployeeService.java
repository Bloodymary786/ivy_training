package com.customerapp.service;

import java.util.List;

import com.customerapp.dao.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployee();
	public Employee deleteEmployee(int id);
	public Employee update(int id, Employee employee);
	public Employee addEmployee(Employee employee);
	public Employee getById(int id);
}
