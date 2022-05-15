package service;

import exception.SystemException;
import model.UserPojo;

public interface UserService {
	
	UserPojo addUser(UserPojo userPojo)throws SystemException;
	UserPojo loginUser(UserPojo userPojo)throws SystemException;

}
