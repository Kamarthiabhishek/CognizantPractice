package Opppss;

public class Bank extends Customer{
	private int AccountNumber, Balance;
	private String AccountType;

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	
	public int AddBalance(int balance) {
		int total = balance + 1000;
		return total;
	}

	String name = printName();
	
//	public Bank() {
//		// TODO Auto-generated constructor stub
//		System.out.println("Constructor created");
//	}
//	
//	public Bank(int accountNumber, int balance, String accountType) {
//		this.AccountNumber = accountNumber;
//		this.Balance = balance;
//		this.AccountType = accountType;
//	}
//
}
