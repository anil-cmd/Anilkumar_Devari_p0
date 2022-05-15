package presentation;

import java.util.Scanner;

import javax.print.attribute.standard.JobOriginatingUserName;

import dao.UserDao;
import dao.UserDaoImpl;
import exception.SystemException;
import model.UserPojo;
import service.UserService;
import service.UserServiceImpl;

public class BankingApplicationSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		UserService testUserService = new UserServiceImpl();
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
					System.out.println("executed");
					userPojo = testUserService.addUser(newuserpojo);
					System.out.println("executed");
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
				userLoginPojo.setUserName(scan.nextLine());
				
				System.out.println("Enter user password:");
				userLoginPojo.setPassword(scan.nextLine());
				
				UserPojo loginUserPojo = null;
				try {
					loginUserPojo = testUserService.loginUser(userLoginPojo);
				} catch (SystemException e) {
					System.out.println("**********************************");
					System.out.println("Sorry!! There is some issue with the database...");
					System.out.println("Please try after sometime....");
					System.out.println("**********************************");
					System.out.println(e.getMessage());
					break;
				}
				
				String userType = loginUserPojo.getUserName();
				if(userType !=null && userType.equals("customer")) {
					System.out.println("**********************************");
					System.out.println("Customer Login successfull!!");
					System.out.println("Display Customer Menu.");
					System.out.println("**********************************");
				}else if(userType !=null && userType.equals("employee")) {
					System.out.println("**********************************");
					System.out.println("Employee Login successfull!!");
					System.out.println("Display Employee Menu.");
					System.out.println("**********************************");
				}else if(userType == null){
					System.out.println("**********************************");
					System.out.println("Login failed!!");
					System.out.println("**********************************");
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

