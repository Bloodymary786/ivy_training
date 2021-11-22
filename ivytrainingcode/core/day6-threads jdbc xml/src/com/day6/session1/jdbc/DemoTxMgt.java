package com.day6.session1.jdbc;
import java.sql.*;
public class DemoTxMgt {

	public static void main(String[] args) {
		
		Connection connection=JdbcConnectionFactory.getConnection();
		try {
			connection.setAutoCommit(false);
			PreparedStatement pstmt=connection
					.prepareStatement("update account set balance=balance -100 where id=?");
			pstmt.setInt(1, 1);
			pstmt.executeUpdate();
			
			 pstmt=connection
					.prepareStatement("update account set balance=balance + 100 where id=?");
			pstmt.setInt(1, 2);
			pstmt.executeUpdate();
			
			connection.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
