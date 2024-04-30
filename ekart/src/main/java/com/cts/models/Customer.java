package com.cts.models;

import java.util.Date;

public class Customer {
	private static String CustomerName, CustomerGender, CustomerAddress, dob, UserName, Password;
	private static int CustomerId;
	
	public static int getCustomerId() {
		return CustomerId;
	}
	public static void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public static String getCustomerGender() {
		return CustomerGender;
	}
	public static void setCustomerGender(String customerGender) {
		CustomerGender = customerGender;
	}
	public static String getCustomerAddress() {
		return CustomerAddress;
	}
	public static void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public static String getDob() {
		return dob;
	}
	public static void setDob(String dob) {
		Customer.dob = dob;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public static String getCustomerName() {
		return CustomerName;
	}
	public static void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public static String getUserName() {
		return UserName;
	}
	public static void setUserName(String userName) {
		UserName = userName;
	}
	public static String getPassword() {
		return Password;
	}
	public static void setPassword(String password) {
		Password = password;
	}	
	
	public Customer(int customerId, String customerName, String customerGender, String customerAddress, String Dob, String username, String password) {
		// TODO Auto-generated constructor stub
		this.CustomerName  = customerName;
		this.CustomerGender = customerGender;
		this.CustomerAddress = customerAddress;
		this.dob = Dob;
		this.CustomerId = customerId;
		this.UserName = username;
		this.Password = password;
		
	}
	
}
