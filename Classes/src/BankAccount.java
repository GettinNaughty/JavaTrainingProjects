
public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void depositFunds(double depositAmount) {
		balance += depositAmount;
		System.out.println("Your balance is "+balance);
	}
	
	public void withdrawFunds(double withdrawalAmount) {
		double checker = balance - withdrawalAmount;;
		if(checker<0) {
			System.out.println("Insufficient funds");
		}
		else {
			balance = checker;
		}
		System.out.println("Your balance is "+ balance);
	}
}
