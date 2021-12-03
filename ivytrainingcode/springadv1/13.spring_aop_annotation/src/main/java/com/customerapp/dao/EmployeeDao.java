package com.customerapp.dao;
import java.util.*;
public interface EmployeeDao {
	public List<Employee> getAllEmployee();
	public void deleteEmployee(int id);
	public void update(int id, Employee employee);
	public void addEmployee(Employee employee);
	public Employee getById(int id);
}
