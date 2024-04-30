package Opppss;

import java.util.Scanner;

public class OOpsMain extends Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		
		System.out.println("Enter the account number:");
		int accountNumber = sc.nextInt();
		b.setAccountNumber(accountNumber);
		System.out.println("Enter the account type : ");
		String accounttype = sc.next();
		b.setAccountType(accounttype);
		System.out.println("Enter the balance : ");
		int balance = sc.nextInt();
		b.setBalance(balance);
		
		System.out.println("Account Number :"+b.getAccountNumber());
		System.out.println("Account Type : "+b.getAccountType());
		System.out.println("Balance : "+b.getBalance());
		System.out.println("Added balance : "+b.AddBalance(balance));
		
	}
}
