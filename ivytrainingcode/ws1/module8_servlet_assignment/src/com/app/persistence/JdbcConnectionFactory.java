package com.app.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionFactory 
{
    private static Connection connection=null;
	
	public static Connection getConnection() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException ex) {}
		
		try 
		{
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/assign", "root", "root");
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	
		return connection;
	}
}
