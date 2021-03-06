package service;

import dao.BankAccountDao;
import dao.BankAccountDaoImpl;
import exception.SystemException;
import model.BankAccountPojo;

public class BankAccountServiceImpl implements BankAccountService {

	BankAccountDao bankAccountDao;

	public BankAccountServiceImpl() {
		bankAccountDao = new BankAccountDaoImpl();
	}

	public BankAccountDao getBankAccountDao() {
		return bankAccountDao;
	}

	public void setBankAccountDao(BankAccountDao bankAccountDao) {
		this.bankAccountDao = bankAccountDao;
	}

	public BankAccountPojo createAccount(BankAccountPojo bankAccountPojo) throws SystemException {
		return bankAccountDao.createAccount(bankAccountPojo);
	}

	public BankAccountPojo depositAmount(BankAccountPojo bankAccountPojo) throws SystemException{
		return bankAccountDao.depositAmount(bankAccountPojo);
	}

	public BankAccountPojo withdrawAmount(BankAccountPojo bankAccountPojo) throws SystemException{
		return bankAccountDao.withdrawAmount(bankAccountPojo);
	}

	public BankAccountPojo viewBalance(BankAccountPojo bankAccountPojo) throws SystemException{
		return bankAccountDao.viewBalance(bankAccountPojo);
	}

}
