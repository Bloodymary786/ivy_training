package com.empapp.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
//it will be called by spring jdbc to covert a tuple to Employee object
public class EmpRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee=new Employee();
		employee.setEid(rs.getInt(1));
		employee.setEname(rs.getString(2));
		employee.setSalary(rs.getDouble(3));
		return employee;
	}

}
