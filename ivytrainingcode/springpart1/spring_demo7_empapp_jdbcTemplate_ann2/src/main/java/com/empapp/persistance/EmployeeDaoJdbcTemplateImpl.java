package com.empapp.persistance;
// a car can not move without petrol Car --> Petrol
//EmployeeDaoJdbcImpl-----> Connection
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Primary
@Repository(value = "empDaoJdbc")
public class EmployeeDaoJdbcTemplateImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = jdbcTemplate.query("select * from emp", new EmpRowMapper());
		return employees;
	}

	@Override
	public Employee getById(int eid) {
		return  jdbcTemplate.queryForObject("select * from emp where eid=?",new EmpRowMapper(), eid);
	}

	@Override
	public void addEmployee(Employee employee) {
		String sql ="insert into emp(ename, salary) values(?,?)";
		jdbcTemplate.update(sql, new Object[] {employee.getEname(), employee.getSalary()});
	}

	@Override
	public void deleteEmployee(int eid) {
		if (getById(eid) != null) {
			String deleteQuery="delete from emp where eid =?";
			jdbcTemplate.update(deleteQuery, new Object[] {eid});
		}
	}

	@Override
	public void updateEmployee(int eid, Employee employee) {
		if (getById(eid) != null) {
			String sql ="update emp set salary =? where eid =?";
			jdbcTemplate.update(sql, new Object[] {employee.getSalary(), eid});
		}
	}
}
