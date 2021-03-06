package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exception.SystemException;
import model.BankAccountPojo;

public class BankAccountDaoImpl implements BankAccountDao{

	public BankAccountPojo createAccount(BankAccountPojo bankAccountPojo)throws SystemException {
		
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "INSERT INTO bank_act(phone_no, act_balance) VALUES ("+bankAccountPojo.getPhoneNo()+", "+bankAccountPojo.getActBalance()+")";
			int rowsAffected = stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		return bankAccountPojo;
		
	}

	public BankAccountPojo depositAmount(BankAccountPojo bankAccountPojo)throws SystemException {
		

		try {
			Connection conn = null;
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "UPDATE bank_act SET act_balance=act_balance+"+bankAccountPojo.getActBalance()+" WHERE phone_no="+bankAccountPojo.getPhoneNo();
			int rowsAffected = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return bankAccountPojo;
		
	}

	public BankAccountPojo withdrawAmount(BankAccountPojo bankAccountPojo)throws SystemException {
		
		try {
			Connection conn = null;
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "UPDATE bank_act SET act_balance=act_balance-"+bankAccountPojo.getActBalance()+" WHERE phone_no="+bankAccountPojo.getPhoneNo();
			int rowsAffected = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return bankAccountPojo;
		
	}

	public BankAccountPojo viewBalance(BankAccountPojo bankAccountPojo)throws SystemException {
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM bank_act WHERE phone_no="+bankAccountPojo.getPhoneNo();
			ResultSet resultSet = stmt.executeQuery(query);
			if(resultSet.next()) {
				bankAccountPojo = new BankAccountPojo(resultSet.getLong(1), resultSet.getDouble(2));
			}
		} catch (SQLException e) {
			throw new SystemException();
		}
		return bankAccountPojo;
	}

}
