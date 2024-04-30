package com.cts.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.cts.DAO.DBOperations;
import com.cts.models.Admin;
import com.cts.models.Customer;
import com.cts.models.Orders;

public class InputFunctions {
	static Scanner sc = new Scanner(System.in);

	public static void Details(int val) {

		DBOperations op = new DBOperations();
		if (val == 1) {
			int AdminId = UserFunctions.RandomNumberGenerator();
			System.out.print("Enter Name : ");
			String name = Validations.validateName();
			System.out.print("Enter Gender : ");
			String gender = Validations.validateName();
			System.out.print("Enter Address : ");
			String address = sc.next();
			System.out.print("Enter Date of Birth : ");
			String dob = Validations.validateDateOfBirth();
			System.out.print("Enter UserName : ");
			String username = sc.next();
			boolean b = true;
			while (b) {
				System.out.print("Enter Password : ");
				String pass = sc.next();

				System.out.print("Re-Enter the Password : ");
				String pass1 = sc.next();

				boolean bo = Validations.passwordMisMatch(pass, pass1);
				if (bo) {
					new Admin(AdminId, name, gender, address, dob, username, pass);
					break;
				}
			}

			boolean rs = op.Insert2Table("ADMIN");
			if (rs) {
				System.out.println("ADMIN ADDED SUCCESFULLY");
				System.out.println("ADMIN ID : " + AdminId);
			} else {
				System.out.println("DETAILS COULD'NT BE ADDED ");
			}

		} else if (val == 2) {
			System.out.print("Enter Name : ");
			String name = Validations.validateName();
			System.out.print("Enter Gender : ");
			String gender = Validations.validateName();
			System.out.print("Enter Address : ");
			String address = sc.next();
			System.out.print("Enter Date of Birth : ");
			String dob = Validations.validateDateOfBirth();
			int CustId = UserFunctions.RandomNumberGenerator();
			System.out.print("Enter UserName : ");
			String username = sc.next();
			boolean b = true;
			while (b) {
				System.out.print("Enter Password : ");
				String pass = sc.next();

				System.out.print("Re-Enter the Password : ");
				String pass1 = sc.next();
				boolean bo = Validations.passwordMisMatch(pass, pass1);
				if (bo) {
					new Customer(CustId, name, gender, address, dob, username, pass);
					break;
				}
			}

			boolean rs = op.Insert2Table("CUSTOMER");
			if (rs) {
				System.out.println("CUSTOMER ADDED SUCCESFULLY");
				System.out.println("CUSOTMER ID : " + CustId);
			} else {
				System.out.println("DETAILS COULD'NT BE ADDED ");
			}
		}

	}

	public static void orders(int cid) {
		DBOperations db = new DBOperations();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		HashMap<Integer, Integer> amt = new HashMap<>();
		boolean close = false;
		while (!close) {
			System.out.print("Enter the product id :");
			int pid = sc.nextInt();
			System.out.print("Enter the quantity :");
			int qty = sc.nextInt();
			int id = generator();

			Orders od = new Orders(cid, qty, pid, id);
			map.put(pid, qty);
			int price = db.getPrices(pid);
			System.out.println("Do you want to shop more? (Y|N)");
			char ch = sc.next().charAt(0);
			

			db.orderProduct(cid, qty);
			amt.put(pid, qty * price);
			if (ch == 'n' || ch=='n') {
				close = true;
			}
		}

		System.out.println("PRODUCT ID");
		int sum = 0;
		for (Map.Entry<Integer, Integer> e : amt.entrySet()) {
//			int prodid = e.getKey();
			int price = e.getValue();
			System.out.println("======================================================");
			
			System.out.println(e.getKey());
			sum += price;
		}

		System.out.println("BILLING AMOUNT : "+sum);
		db.Billing(cid, sum);
	}

	public static int generator() {
		Random r = new Random();
		int num = r.nextInt(9000) + 1000;
		return num;
	}
}
