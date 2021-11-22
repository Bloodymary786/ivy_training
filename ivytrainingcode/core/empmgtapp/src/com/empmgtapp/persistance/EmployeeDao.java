package com.empmgtapp.persistance;
import java.util.*;
public interface EmployeeDao {
	public List<Employee> getAllEmployees();
	public Employee getById(int eid);
	public void addEmployee(Employee employee);
	public void updateEmployee(int eid, Employee employee);
	public void deleteEmployee(int eid);
}
