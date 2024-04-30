package bankAccountDetails;

import java.util.Scanner;

public class AccountDetails {
	
	public static void main(String[] args) {
		AccountDetails ad =new AccountDetails();
		Account a = ad.getAccountDetails();
	}
	
	public Account getAccountDetails() {
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account id:");
		int accountId = sc.nextInt();
		a.setAccountId(accountId);
		System.out.println("Enter account type:");
		String type = sc.next();
		a.setAccountType(type);
		int balance;
		do {
			System.out.println("Enter balance:");
			balance = sc.nextInt();
			if(balance<0) {
				System.out.println("Balance should be positive");
			}
			a.setBalance(balance);
		}while(balance <= 0);
		
		int rslt = getWithdrawAmount();
		a.withdraw(rslt);
		
		a = new Account(accountId, type, balance);
		return a;
	}
	
	public int getWithdrawAmount() {
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		int amt;
		do {
			System.out.println("Enter amount to be withdrawen:");
			amt = sc.nextInt();
			if(amt<0) {
				System.out.println("Amount should be positive");
			}
			a.setBalance(amt);
		}while(amt <= 0);	
		
		return amt;
	}
}
