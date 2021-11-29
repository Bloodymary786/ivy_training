package com.app.persistence;

import java.sql.*; 

public class UserDaoJdbcImpl implements UserDao {

	private Connection connection;

	public UserDaoJdbcImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}
	@Override
	public User getByNameAndPassword(String name, String password) {
		User user = null;
		try {
			System.out.println("pqrst");
		
			PreparedStatement pstmt = connection
					.prepareStatement("select * from user where name=? and password =?");
			pstmt.setString(1, name);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			System.out.println("pqrstfghj");
			if (rs.next()) {
				user=new User(name, password);
			}else {
				throw new UserNotFoundException("user with name "+ name + " is not found");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public void addUser(User user) 
	{
		
		try {
			PreparedStatement pstmt = connection
					.prepareStatement("insert into user where name=? and password =?");
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPassword());

//			ResultSet rs = pstmt.executeQuery();
//			
//			if (rs.next()) {
//				user=new User(name, password);
//			}else {
//				throw new UserNotFoundException("user with name "+ name + " is not found");
//			}

		} catch (SQLException | UserNotFoundException e) {
		}
		//return user;
}

}