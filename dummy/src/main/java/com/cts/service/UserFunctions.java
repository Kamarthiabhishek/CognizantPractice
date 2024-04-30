package com.cts.service;

import java.util.*;

import com.cts.DB.dbOperations;
import com.cts.beans.Registration;
import com.cts.beans.Payments;

public class UserFunctions {
	static Scanner sc = new Scanner(System.in);
	
	public static void Details() {
		String status;
		int id  = generateId();
		System.out.println("Enter the name : ");
		String name = sc.next();
		
		System.out.println("Enter the phone number : ");
		String phno = sc.next();
		
		System.out.println("Enter the room Number : ");
		int roomNo = sc.nextInt();
		
		
		System.out.println("Payment (Y/N) : ");
		char ch = sc.next().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			bill();
			status = "Success";
		}else {
			status = "Not paid";
		}
		
		new Registration(name, status, phno, id, roomNo);
		
		boolean i = dbOperations.insert();
		if(i) {
			System.out.println("Reserved Successfully!!");
			System.out.println("Reservation ID : " + id);
		}else {
			System.out.println("Couldn't reserve!!");
		}
	}
	
	public static void bill() {
		System.out.println("Enter the Customer id : ");
		int Cid = sc.nextInt();
		System.out.println("Enter the amount : ");
		int amount = sc.nextInt();
		
		String status = "PAID";
		new Payments(Cid, amount);
		dbOperations.makePayment();
		dbOperations.updateDetails(Cid, status);
		
	}
	public static int generateId() {
		Random r = new Random();
		int num = r.nextInt(9000) + 1000;
		return num;
	}
}
