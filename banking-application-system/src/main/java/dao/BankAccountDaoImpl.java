package dao;

import java.sql.Connection;
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

	public BankAccountPojo depositAmount(int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public BankAccountPojo withdrawAmount(int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double viewBalance() {
		// TODO Auto-generated method stub
		return null;
	}

}
