package com.cts.cart;

import java.util.Scanner;

import com.cts.DAO.DBoperations;
import com.cts.services.UserFunctions;

public class App {
	public static int loginId = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DBoperations db = new DBoperations();
		UserFunctions uf = new UserFunctions();
		boolean close = false;
		
		while(!close) {
			System.out.println("1. Login\n"
					+ "2. BUY");
			System.out.println("Enter the choice : ");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				if(loginId != 0) {
					System.out.println("Already LoggedIn");
				}else {
					int loginStat = uf.getValue();
					loginId = loginStat;
					System.out.println("Login ID : "+loginId);
				}
				break;
				
			case 2:
				if(loginId == 0) {
					System.out.println("Login to order!!");
					break;
				}
				System.out.println("Order:");
				uf.orders(loginId);
				break;
			default:
				break;
			}
		}
		
		
		
		
	}
}
