package com.bankapp.dao.customer;

import java.sql.*;

import com.bankapp.dao.factory.JdbcConnectionFactory;
import com.bankapp.dao.user.User;
import com.bankapp.dao.user.UserNotFoundException;

public class CustomerDaoImpl implements CustomerDao {
	private Connection connection;

	public CustomerDaoImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}

	@Override
	public void addCustomer(Customer customer) {

		try {
			PreparedStatement pstmt = connection.prepareStatement(
					"insert into customers(name, dob, address, email, balance ,accountType ) values(?,?,?,?,?,?)");
			pstmt.setString(1, customer.getName());
			
			pstmt.setDate(2, new Date(customer.getDob().getTime()));//whenever ur are calling setDate method it will accept date of sql type
			
			pstmt.setString(3, customer.getAddress());
			pstmt.setString(4, customer.getEmail());
			pstmt.setDouble(5, customer.getBalance());
			pstmt.setString(6, customer.getAccountType());
			pstmt.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
