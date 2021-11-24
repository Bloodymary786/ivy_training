package com.empapp.persistance.user;

import java.sql.*;

import com.empapp.persistance.factory.JdbcConnectionFactory;

public class UserDaoJdbcImpl implements UserDao {

	private Connection connection;

	public UserDaoJdbcImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}

	@Override
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

		} catch (SQLException e) {
		}
		return null;
	}

	@Override
	public void addUser(User user) {
		//
	}

}
