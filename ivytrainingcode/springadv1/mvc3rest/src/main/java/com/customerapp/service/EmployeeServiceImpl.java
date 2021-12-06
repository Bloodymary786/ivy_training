package com.customerapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customerapp.dao.Employee;
import com.customerapp.dao.EmployeeDao;
import com.customerapp.service.aspects.MyLogging;
//SL =BL + CCC
@Service(value = "empService")
@Transactional   // around advice to handle ccc ie tx in declartive way!
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	@MyLogging
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	@MyLogging
	@Override
	public Employee deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}

	
	@Override
	public Employee update(int id, Employee employee) {
		return employeeDao.update(id, employee);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public Employee getById(int id) {
		return employeeDao.getById(id);
	}

}
