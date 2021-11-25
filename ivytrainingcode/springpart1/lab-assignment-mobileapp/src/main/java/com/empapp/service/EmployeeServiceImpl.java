package com.empapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empapp.persistance.Employee;
import com.empapp.persistance.EmployeeDao;
@Transactional	//AOP * part 2
@Service(value = "empService")
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
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

	@Override
	public Employee getByName(String ename) {
		return employeeDao.getByName(ename);
	}

}
