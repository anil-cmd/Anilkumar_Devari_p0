package dao;

import java.sql.Statement;

import exception.SystemException;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.ResultSet;

import model.UserPojo;

public class UserDaoImpl implements UserDao{
	
	public UserPojo addUser(UserPojo userPojo)throws SystemException {
		
		Connection conn;
		
		try {
			
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "INSERT INTO user_details(user_name, email_id, password, phone_no) VALUES ('"+userPojo.getUserName()+"', '"+userPojo.getEmailId()+"', '"+userPojo.getPassword()+"', "+userPojo.getPhoneNo()+")";
			int rowsAffected = stmt.executeUpdate(query);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return userPojo;
		
		
		
	}

	public UserPojo loginUser(UserPojo userPojo)throws SystemException {
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "select * from user_details where user_name='"+userPojo.getUserName()
			+"' and password='"+userPojo.getPassword()+"'";
			ResultSet resultSet = stmt.executeQuery(query);
			if(resultSet.next()) {
				
				userPojo.setUserName(resultSet.getString(1));
				userPojo.setEmailId(resultSet.getString(2));
				userPojo.setPassword(resultSet.getString(3));
				userPojo.setPhoneNo(resultSet.getInt(4));

			}
		} catch (SQLException e) {
			throw new SystemException();
		}
		return userPojo;
	}
	
	

}
