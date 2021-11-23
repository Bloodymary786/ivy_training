package com.empapp.service;

import java.util.List;

import com.empapp.persistance.Employee;
//service layer =BL + CCC* (sec tx logging caching)
public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getById(int eid);
	public void addEmployee(Employee employee);
	public void deleteEmployee(int eid);
	public void updateEmployee(int eid, Employee employee);
}
