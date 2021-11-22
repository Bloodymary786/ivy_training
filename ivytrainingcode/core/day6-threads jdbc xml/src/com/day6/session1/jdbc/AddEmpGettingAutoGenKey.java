package com.day6.session1.jdbc;
import java.sql.*;
public class AddEmpGettingAutoGenKey {

	public static void main(String[] args) {
		Connection connection=JdbcConnectionFactory.getConnection();
		//add a rec
		try {
			PreparedStatement pstmt=
					connection.prepareStatement
					("insert into emp(ename, salary) values(?,?)" , Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "ajit");
			pstmt.setDouble(2, 74);
			pstmt.executeUpdate();
			
			//how to get auto gen key
			ResultSet rs=pstmt.getGeneratedKeys();
			if(rs.next()) {
				System.out.println("auto gen key is:"+rs.getInt(1));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
