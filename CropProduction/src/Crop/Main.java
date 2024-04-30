package Crop;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Login \n2. Register \nEnter the choice");
		int n = sc.nextInt();
	}
	
	public Register registerUser() {
		System.out.print("Enter Name : ");
		String name = sc.next();
		
		System.out.print("Enter Name : ");
		String address = sc.next();

		System.out.print("Enter Name : ");
		String gender = sc.next();

		System.out.print("Enter Name : ");
		String location = sc.next();

		System.out.print("Enter Name : ");
		int age = sc.nextInt();
		
		Register r = new Register(name, address, gender, location, age);
		return r;
	}
}

