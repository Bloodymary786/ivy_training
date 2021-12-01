package com.demo.dao;

import java.sql.*;

import com.demo.bean.Customer;
import com.demo.factory.JdbcConnectionFactory;

 

public class CustomerDaoImpl implements CustomerDao{
	private Connection connection;

	public CustomerDaoImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}
	public void addCustomer(Customer customer) {
		try {
			PreparedStatement pstmt = connection.prepareStatement
					("insert into customers(name,dob,address,email,accountType,balance) values(?,?,?,?,?,?)");
			pstmt.setString(1, customer.getName());
			pstmt.setDate(2, new Date(customer.getDob().getTime()));
			pstmt.setString(3, customer.getAddress());
			pstmt.setString(4, customer.getEmail());
			pstmt.setString(5,customer.getAccountType());
			pstmt.setDouble(6,customer.getBalance());
			
			System.out.println(customer.getBalance());
			pstmt.executeUpdate();
			
			System.out.println("Updated success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}