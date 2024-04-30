package com.cts.ekart;

import java.util.Scanner;

import com.cts.DAO.DBOperations;
import com.cts.service.InputFunctions;
import com.cts.service.UserFunctions;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static int LoginId = 0;

	public static void main(String[] args) {
		DBOperations db = new DBOperations();
		db.Connect2DB();

		boolean b = true;
		UserFunctions uf = new UserFunctions();
		while (b) {
			System.out.println("WELCOME TO VASH E-KART ");
			int flag1 = 0;
			while (flag1 == 0) {
				System.out.println("1. ADMIN\n" + "2. CUSTOMER\n");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					UserFunctions.AdminFunctions();
					break;

				case 2:

					UserFunctions.CustomerFunctions();
					break;
				default:
					System.out.println("Enter correct option!!");
					break;
				}
			}

		}

	}

}
