package com.cts.service;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
	static Scanner sc = new Scanner(System.in);

	public static String validateName() {
		String name;
		boolean b = true;
		do {
			name = sc.next();
			if (name.matches("[a-zA-Z]*")) {
				b = false;
			} else {
				System.out.println("Enter your name only in Alphabets");
				System.out.print("Re-Enter the Name : ");
			}
		} while (b);
		return name;
	}

	public static String validateDateOfBirth() {
		String dobstr;
		boolean b = true;
		do {
			dobstr = sc.next();
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);

			try {
				Date dob = df.parse(dobstr);
				b = false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Incorrect format!!");
				System.out.println("Enter the date in correct format (dd/MM/yyyy)");
			}
		} while (b);
		return dobstr;
	}

	public static boolean passwordMisMatch(String pass, String pass1) {
		boolean b = true;

		while (b) {
			if (pass.equals(pass1)) {
				return true;
			} else {
				System.out.println("Passwords Doesn't Match!!");
				b = false;
				return false;

			}
		}
		return false;
	}

	public static int IdCheck() {
		Scanner sc = new Scanner(System.in);
		
		boolean b = true;
		int id = 0;
		while (b) {
			System.out.print("Enter the Customer ID : ");
			if(!sc.hasNextInt()) {
				System.out.println("Enter only in numbers");
				sc.next();
			}else {
				id=sc.nextInt();
				break;
			}
		}
		return id;
	}
//	
//	public static String passwrdCheck() {
//		
//		String rgx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).";
//		Pattern p = Pattern.compile(rgx);
//		Matcher m = p.matcher(rgx)
//	}
}
