package com.bankapp.dao.transactions;
import java.util.*;
import java.sql.*;
import java.util.Date;

import com.bankapp.dao.factory.JdbcConnectionFactory;

public class AccountTransactionImpl implements AccountTransaction {
	
	private Connection connection;

	public AccountTransactionImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}

	
	@Override
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
			pstmt=connection.prepareStatement("insert into account_transaction(txdate,cid, amount, optype) values (?,?,?,?)");
			pstmt.setDate(1	, new java.sql.Date(new Date().getTime()));
			pstmt.setInt(2, id);
			pstmt.setDouble(3, amount);
			pstmt.setString(4, "deposit");
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

	@Override
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
					pstmt=connection.prepareStatement("insert into account_transaction(txdate,cid, amount, optype) values (?,?,?,?)");
					pstmt.setDate(1	, new java.sql.Date(new Date().getTime()));
					pstmt.setInt(2, id);
					pstmt.setDouble(3, amount);
					pstmt.setString(4, "withdraw");
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

	@Override
	public List<Transaction> getAllTransactions() {
		List<Transaction> transactions=new ArrayList<Transaction>();
		//account_transaction
		try{
			PreparedStatement pstmt=connection.prepareStatement("select * from account_transaction");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Transaction transaction=new Transaction();
				transaction.setTxdate(rs.getDate(2));
				transaction.setAmount(rs.getDouble(4));
				transaction.setOptype(rs.getString(5));
				transaction.setCid(rs.getInt(3));
				transaction.setTid(rs.getInt(1));
				transactions.add(transaction);
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return transactions;
	}

	@Override
	public List<Transaction> getTransactionsBetweenTwoDates(Date fromDate, Date toDate) {
		List<Transaction> transactions=new ArrayList<Transaction>();
		//account_transaction
		try{
			PreparedStatement pstmt=connection.prepareStatement("SELECT * FROM account_transaction WHERE txdate>=? AND txdate <=?");
			pstmt.setDate(1, new java.sql.Date(fromDate.getTime()));
			pstmt.setDate(2, new java.sql.Date(toDate.getTime()));
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Transaction transaction=new Transaction();
				transaction.setTxdate(rs.getDate(2));
				transaction.setAmount(rs.getDouble(4));
				transaction.setOptype(rs.getString(5));
				transaction.setCid(rs.getInt(3));
				transaction.setTid(rs.getInt(1));
				transactions.add(transaction);
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return transactions;
	}

}















