package com.demo;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getById(int id) {
		return new Employee(id, "emp "+id, 5675656);
	}

}
