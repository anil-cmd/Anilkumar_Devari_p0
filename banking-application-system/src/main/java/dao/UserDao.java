package dao;

import exception.SystemException;
import model.UserPojo;

public interface UserDao {
	
	UserPojo addUser(UserPojo userpojo)throws SystemException;
	UserPojo loginUser(UserPojo userpojo)throws SystemException;

}
