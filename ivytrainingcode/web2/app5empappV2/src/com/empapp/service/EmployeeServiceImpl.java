package com.empapp.service;

import java.util.List;

import com.empapp.persistance.employee.Employee;
import com.empapp.persistance.employee.EmployeeDao;
import com.empapp.persistance.employee.EmployeeDaoJdbcImpl;
// Service layer --> dao layer ---> connection
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	//spring framework
	 public EmployeeServiceImpl() {
		 employeeDao=new EmployeeDaoJdbcImpl(); //:(
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllEmployees();
	}

	@Override
	public Employee getById(int eid) {
		return employeeDao.getById(eid);
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	@Override
	public void deleteEmployee(int eid) {
		employeeDao.deleteEmployee(eid);
	}

	@Override
	public void updateEmployee(int eid, Employee employee) {
		employeeDao.updateEmployee(eid, employee);
	}

}
