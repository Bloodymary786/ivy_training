package com.day6.session1.jdbc;
import java.sql.*;
public class AddEmp {

	public static void main(String[] args) {
		Connection connection=JdbcConnectionFactory.getConnection();
		//add a rec
		try {
			PreparedStatement pstmt=
					connection.prepareStatement("insert into emp(ename, salary) values(?,?)");
			pstmt.setString(1, "umesh");
			pstmt.setDouble(2, 81);
			int noOfRows= pstmt.executeUpdate();
			System.out.println(noOfRows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
