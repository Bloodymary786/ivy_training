package com.day6.session1.jdbc;

import java.sql.*;

public class JdbcConnectionFactory {
	private static Connection connection;

	private JdbcConnectionFactory() {
	}

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ivy_demo?useSSL=false", "root",
					"root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}





