package dao;

import exception.SystemException;
import model.BankAccountPojo;

public interface BankAccountDao {
	
	BankAccountPojo createAccount(BankAccountPojo bankAccountPojo) throws SystemException;
	BankAccountPojo depositAmount(BankAccountPojo bankAccountPojo)throws SystemException;
	BankAccountPojo withdrawAmount(BankAccountPojo bankAccountPojo)throws SystemException;
	BankAccountPojo viewBalance(BankAccountPojo bankAccountPojo)throws SystemException;

}
