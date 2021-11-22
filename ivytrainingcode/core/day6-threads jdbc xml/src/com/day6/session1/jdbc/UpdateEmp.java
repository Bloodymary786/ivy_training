package com.day6.session1.jdbc;
import java.sql.*;
public class UpdateEmp {

	public static void main(String[] args) {
		Connection connection=JdbcConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt=connection.prepareStatement("update emp set salary =? where eid=?");
			pstmt.setDouble(1, 83);
			pstmt.setInt(2	, 5);
			pstmt.executeUpdate();
			System.out.println("rec is updated...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
