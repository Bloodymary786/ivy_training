package com.day6.session1.jdbc;
import java.sql.*;
public class HelloWorld {
	public static void main(String[] args) {
		//hello world jdbc 
		//1. load the driver 
		
		//factory "design pattern"
		
		// i want to hide connectoin creation logic (repeated again an again )
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. get jdbc COnnection
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ivy_demo?useSSL=false","root","root");
			//3 .print all the records
			//Statement: simplest, but performace issue, SQL injection issue
			//PrepareStatement: faseter as it have pre compileted quaries, no problem of sql injection
			//CallableStatus: extended from PrepareStatement, and it is used for store procedure*
			
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");//executeQuery vs executeUpdate
			while(rs.next()) {
				//System.out.println(rs.getInt(1)+" : "+ rs.getString(2)+" : "+ rs.getDouble(3));
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
