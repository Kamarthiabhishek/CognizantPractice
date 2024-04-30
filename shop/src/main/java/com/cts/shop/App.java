package com.cts.shop;

import java.util.Scanner;

import com.cts.DB.DB;

/**
 * Hello world!
 *
 */
public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean i = DB.Connect2DB();
		
		System.out.println("1. Read all products\n"
				+ "2. Add to cart");
		System.out.println("Enter the choice : ");
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		case '1':
			boolean j = DB.ReadAll();
			if(j) {
				
			}else {
				System.out.println("No Items");
			}
			break;

		default:
			break;
		}
	}
}
