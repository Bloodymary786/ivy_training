package com.demo.transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.demo.factory.JdbcConnectionFactory;

import java.sql.*;
import com.demo.bean.Transaction;


public class AccountTransactionImpl implements AccountTransaction{

	private Connection connection;

	public AccountTransactionImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}

	public void deposit(int id, double amount) {
		//what should be the logic
				// id=1 ravi => 200
				//
				//2 i need to add a entry to the accout_table so that we have record of it
				try {
					connection.setAutoCommit(false);
					
					// 1. i need to update the customer table to have balance =balance + amount
					PreparedStatement pstmt=connection.prepareStatement("update customers set balance =balance + ? where id=?");
					pstmt.setDouble(1, amount);
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
					
					//2 i need to add a entry to the accout_table so that we have record of it
					pstmt=connection.prepareStatement("select balance from customers where id=?");
					pstmt.setInt(1, id);
					ResultSet rs=pstmt.executeQuery();
					double bal=0;
					if(rs.next())
					{
						bal=rs.getDouble("balance");
					}
					pstmt=connection.prepareStatement("insert into account_transaction(txdate,cid, amount, optype,availBalance) values (?,?,?,?,?)");
					pstmt.setDate(1	, new java.sql.Date(new Date().getTime()));
					pstmt.setInt(2, id);
					pstmt.setDouble(3, amount);
					pstmt.setString(4, "withdraw");
					
					pstmt.setDouble(5,bal );
					pstmt.executeUpdate();
					
					connection.commit();
					
				}catch (SQLException e) {
					e.printStackTrace();
					try {
						connection.rollback();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	}

	public void withdraw(int id, double amount) {
		//what should be the logic
		// id=1 ravi => 200
		//
		//2 i need to add a entry to the accout_table so that we have record of it
		try {
			connection.setAutoCommit(false);
			
			// 1. i need to update the customer table to have balance =balance + amount
			PreparedStatement pstmt=connection.prepareStatement("update customers set balance =balance - ? where id=?");
			pstmt.setDouble(1, amount);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			
			//2 i need to add a entry to the accout_table so that we have record of it
			pstmt=connection.prepareStatement("select balance from customers where id=?");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			double bal=0;
			if(rs.next())
			{
				bal=rs.getDouble("balance");
			}
			pstmt=connection.prepareStatement("insert into account_transaction(txdate,cid, amount, optype,availBalance) values (?,?,?,?,?)");
			pstmt.setDate(1	, new java.sql.Date(new Date().getTime()));
			pstmt.setInt(2, id);
			pstmt.setDouble(3, amount);
			pstmt.setString(4, "withdraw");
			
			pstmt.setDouble(5,bal );
			pstmt.executeUpdate();
			
			connection.commit();
			
		}catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	}

//	public List<AccountTransaction> getAllTransactions() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public List<com.demo.bean.Transaction> getTransactionsBetweenTwoDates(Date fromDate, Date toDate) {
		List<Transaction> list=new ArrayList<>();
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from account_transaction where txdate>=? and txdate<=?");
			pstmt.setDate(1, new java.sql.Date(fromDate.getTime()));
			pstmt.setDate(2, new java.sql.Date(toDate.getTime()));
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				Date date=rs.getDate(2);
				System.out.println(date);
				String desc=rs.getString(5);
				double amount=rs.getDouble(4);
				double availBalance=rs.getDouble(6);
			list.add(new Transaction(date,amount,desc,availBalance));
			
                System.out.println(list);
             return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	 
 

	 

}
