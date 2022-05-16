package presentation;

import java.util.Scanner;

import javax.print.attribute.standard.JobOriginatingUserName;

import dao.UserDao;
import dao.UserDaoImpl;
import exception.SystemException;
import model.BankAccountPojo;
import model.UserPojo;
import service.BankAccountService;
import service.BankAccountServiceImpl;
import service.UserService;
import service.UserServiceImpl;

public class BankingApplicationSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		UserService userService = new UserServiceImpl();
		BankAccountService accountService = new BankAccountServiceImpl();
		char proceed = 'y';

		while (proceed == 'y') {
			System.out.println("*****************************");
			System.out.println("BANKING APPLICATION SYSTEM");
			System.out.println("*****************************");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("*****************************");
			System.out.println("Please enter an option:");
			int option = scan.nextInt();
			System.out.println("*****************************");
			switch (option) {

			case 1:
				UserPojo newuserpojo = new UserPojo();
				System.out.println("Please enter your UserName : ");
				scan.nextLine();
				newuserpojo.setUserName(scan.nextLine());
				System.out.println("Please enter emailid : ");
				newuserpojo.setEmailId(scan.nextLine());
				System.out.println("Please enter password : ");
				newuserpojo.setPassword(scan.nextLine());
				System.out.println("Please enter phoneno : ");
				newuserpojo.setPhoneNo(scan.nextInt());
				UserPojo userPojo = null;
				try {
					userPojo = userService.addUser(newuserpojo);
				} catch (SystemException e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.println("*****************************");
				System.out.println("New User added successfully! \nUser NAME is :" + userPojo.getUserName());
				System.out.println("*****************************");
				break;
			case 2:
				UserPojo userLoginPojo = new UserPojo();
				
				System.out.println("Enter username:");
				scan.nextLine();
				userLoginPojo.setUserName(scan.nextLine());
				
				System.out.println("Enter user password:");
				userLoginPojo.setPassword(scan.nextLine());
				
				UserPojo returnedLoginUserPojo = null;
				try {
					returnedLoginUserPojo = userService.loginUser(userLoginPojo);
				} catch (SystemException e) {
					System.out.println("**********************************");
					System.out.println("Sorry!! There is some issue with the database...");
					System.out.println("Please try after sometime....");
					System.out.println("**********************************");
					System.out.println(e.getMessage());
					break;
				}
				
				long userIdentification = returnedLoginUserPojo.getPhoneNo();
				if(userIdentification !=0) {
					System.out.println("**********************************");
					System.out.println("user login successfull!! :"+returnedLoginUserPojo.getPhoneNo() );
					System.out.println("*****************************");
					System.out.println("1. Create Account");
					System.out.println("2. Deposit Funds");
					System.out.println("3. Withdraw Funds");
					System.out.println("4. View Balance");
					System.out.println("*****************************");
					System.out.println("Please enter an option:");
					int opt = scan.nextInt();
					System.out.println("*****************************");
					switch (opt) {
					case 1:
						BankAccountPojo newAccountPojo = new BankAccountPojo();
						System.out.println("Please enter phoneno : ");
						scan.nextLine();
						newAccountPojo.setPhoneNo(scan.nextInt());
						System.out.println("Please enter deposit amount : ");
						newAccountPojo.setActBalance(scan.nextDouble());
						BankAccountPojo accountPojo = null;
						try {
							accountPojo = accountService.createAccount(newAccountPojo);
						} catch (SystemException e) {
							System.out.println(e.getMessage());
							break;
						}
						System.out.println("*****************************");
						System.out.println("New Account added successfully! \nAccount balance is :$" + accountPojo.getActBalance());
						System.out.println("*****************************");
						break;
						
					case 2:
						
					}
				}
				else {
					System.out.println("Please enter valid user credentials");
				}
				break;
			}
			System.out.println("*******************************************************************");
			System.out.println("Thank you for using Banking Application System!!");
			System.out.println("*******************************************************************");
			System.exit(0);

		}
		

	}
}

