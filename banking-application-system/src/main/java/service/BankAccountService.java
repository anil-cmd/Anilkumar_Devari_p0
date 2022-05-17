package service;

import exception.SystemException;
import model.BankAccountPojo;

public interface BankAccountService {
	
	BankAccountPojo createAccount(BankAccountPojo bankAccountPojo) throws SystemException;
	BankAccountPojo depositAmount(BankAccountPojo bankAccountPojo)throws SystemException;
	BankAccountPojo withdrawAmount(BankAccountPojo bankAccountPojo)throws SystemException;
	BankAccountPojo viewBalance(BankAccountPojo bankAccountPojo)throws SystemException;
	

}
