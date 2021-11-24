package com.empapp.persistance.factory;
import java.sql.*;

public class JdbcConnectionFactory {
	private JdbcConnectionFactory() {}
	
	private static Connection connection=null;
	
	public static Connection getConnection() {
		
		//1. load the driver 
		try {
			Class.forName("com.mysql.jdbc.Driver");//dynamic class loading?
		}catch(ClassNotFoundException ex) {}
		//2. get the connection
		try {
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ivy_demo", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
