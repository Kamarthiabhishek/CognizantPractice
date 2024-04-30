package com.cts.dummy;

import java.util.Scanner;

import com.cts.DB.dbOperations;
import com.cts.service.UserFunctions;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean i = dbOperations.Connect2DB();
		
		boolean b = true;
		while (b) {
			System.out.println("1. RESERVE\n2. MAKE PAYMENT");
			System.out.println("Enter your choice : ");
			char ch = sc.next().charAt(0);
			switch (ch) {
			case '1':
				if (i) {
					UserFunctions.Details();
				} else {
					System.out.println("Connect to DB");
				}
				break;
			case '2':
				if (i) {
					UserFunctions.bill();
				} else {
					System.out.println("Connect to Db");
				}
			case '3':
				System.exit(0);
				b =false;
				break;
			default:
				System.out.println("Enter correct option!!");
				break;
			}
		}

	}
}
