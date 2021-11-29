package com.bankapp.dao.customer;

import java.sql.*;

import com.bankapp.dao.factory.JdbcConnectionFactory;

public class CustomerDaoImpl implements CustomerDao{
	private Connection connection;

	public CustomerDaoImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}
	@Override
	public void addCustomer(Customer customer) {
		
	}

}
