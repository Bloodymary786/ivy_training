package com.day6.session1.jdbc;
import java.sql.*;
public class JdbcInsertionWithBatch {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Connection connection=JdbcConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt=connection.prepareStatement("insert into temp(name) value (?)");
			connection.setAutoCommit(false);
			//must apply <=
			for(int i=1;i<=10000; i++) {
				pstmt.setString(1, "foo "+ i);
				pstmt.addBatch();
				if(i%2000==0) {
					pstmt.executeBatch();
				}
			}
			connection.commit();
			
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
