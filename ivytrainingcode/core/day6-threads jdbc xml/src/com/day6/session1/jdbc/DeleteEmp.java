package com.day6.session1.jdbc;
import java.sql.*;
public class DeleteEmp {

	public static void main(String[] args) {
		Connection connection=JdbcConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt=connection.prepareStatement("delete from emp where eid=?");
			pstmt.setInt(1	, 5);
			pstmt.executeUpdate();
			System.out.println("rec is deleted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
