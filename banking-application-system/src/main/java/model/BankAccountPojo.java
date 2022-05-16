package model;

//private variables
//default constructore
//parametrized constructor
//public getters/setters
//toString
//equals - if required
//hashCode - if required

public class BankAccountPojo {

	private long phoneNo;
	private Double actBalance;

	public BankAccountPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccountPojo(long phoneNo, Double actBalance) {
		super();
		this.phoneNo = phoneNo;
		this.actBalance = actBalance;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Double getActBalance() {
		return actBalance;
	}

	public void setActBalance(Double actBalance) {
		this.actBalance = actBalance;
	}

	@Override
	public String toString() {
		return "BankAccountPojo [phoneNo=" + phoneNo + ", actBalance=" + actBalance + "]";
	}

}
