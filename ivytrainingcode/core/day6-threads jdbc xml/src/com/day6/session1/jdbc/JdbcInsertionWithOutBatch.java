package com.day6.session1.jdbc;
import java.sql.*;
public class JdbcInsertionWithOutBatch {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		
		//by default auto commit is there in jdbc when u are doing executeUpdate()
		Connection connection=JdbcConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt=connection.prepareStatement("insert into temp(name) value (?)");
			
			//must apply <=
			for(int i=1;i<=10000; i++) {
				pstmt.setString(1, "foo "+ i);
				pstmt.executeUpdate();
			}
			
			long end=System.currentTimeMillis();
			
			System.out.println("time taken: "+ (end-start)+" ms");
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}

/*
create table temp(name varchar not null);

10000/200 => 50			time taken: 1.411 sec
10000/2000 => 5   		time taken: 1.440 sec

driver is loaded...
time taken: 10.679 sec
*/