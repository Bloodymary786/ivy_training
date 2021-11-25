package com.empapp.persistance;
import java.util.*;
public interface EmployeeDao {
	public List<Employee> getAllEmployees();
	public Employee getById(int eid);
	public Employee getByName(String ename);
	public void addEmployee(Employee employee);
	public void deleteEmployee(int eid);
	public void updateEmployee(int eid, Employee employee);
}
