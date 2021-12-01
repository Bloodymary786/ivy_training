package com.demo.dao;

import java.sql.*;
import java.sql.PreparedStatement;

import com.demo.bean.User;
import com.demo.factory.JdbcConnectionFactory;

public class UserDaoJdbcImpl implements UserDao {
	
	
	private Connection connection;

	public UserDaoJdbcImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}


	public User getByUserNameAndPassword(String userName, String password) {
		User user = null;
		try {
			PreparedStatement pstmt = connection
					.prepareStatement("select * from users where username=? and password =?");
			pstmt.setString(1, userName);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				user=new User(userName, password, rs.getString(3));
			}else {
				throw new UserNotFoundException("user with name "+ userName + " is not found");
			}

		} catch (SQLException ex) {
			
		}
		return user;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
}
 

 