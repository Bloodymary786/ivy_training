package com.empapp.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
// a car can not move without petrol Car --> Petrol
//EmployeeDaoJdbcImpl-----> Connection

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	private Connection connection;

	public EmployeeDaoJdbcImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee tempEmp = null;
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from emp");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				tempEmp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				employees.add(tempEmp);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return employees;
	}

	@Override
	public Employee getById(int eid) {
		Employee employee = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from emp where eid=?");
			pstmt.setInt(1, eid);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				employee = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
			} else {
				throw new EmployeeNotFoundException(" emp with id =" + eid + " is not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into emp(ename, salary) values(?,?)");
			pstmt.setString(1, employee.getEname());
			pstmt.setDouble(2, employee.getSalary());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmployee(int eid) {
		if (getById(eid) != null) {
			try {
				PreparedStatement pstmt = connection.prepareStatement("delete from emp where eid =?");
				pstmt.setInt(1, eid);

				pstmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateEmployee(int eid, Employee employee) {
		if (getById(eid) != null) {
			try {
				PreparedStatement pstmt = connection.prepareStatement("update emp set salary =? where eid =?");
				pstmt.setDouble(1, employee.getSalary());
				pstmt.setInt(2, employee.getEid());

				pstmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
