package com.customerapp.dao;
import java.util.*;
public interface EmployeeDao {
	public List<Employee> getAllEmployee();
	public Employee deleteEmployee(int id);
	public Employee update(int id, Employee employee);
	public Employee addEmployee(Employee employee);
	public Employee getById(int id);
}
