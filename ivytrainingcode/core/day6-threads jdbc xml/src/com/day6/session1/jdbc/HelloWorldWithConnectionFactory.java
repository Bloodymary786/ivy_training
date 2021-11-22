package com.day6.session1.jdbc;
import java.sql.*;
public class HelloWorldWithConnectionFactory {
	public static void main(String[] args) {
		
		Connection connection=null;
		try {
			 connection=JdbcConnectionFactory.getConnection();
			
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");
			while(rs.next()) {
				
				System.out.println(rs.getInt("eid")+" : "+ rs.getString("ename")+" : "+ rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
