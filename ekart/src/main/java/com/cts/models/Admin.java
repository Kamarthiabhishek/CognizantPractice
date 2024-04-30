package com.cts.models;

public class Admin {
	private static String AdminName, AdminGender, AdminAddress, dob, UserName, Password;
	private static int AdminId;
	
	public static int getAdminId() {
		return AdminId;
	}
	public static void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public static String getAdminGender() {
		return AdminGender;
	}

	public static void setAdminGender(String adminGender) {
		AdminGender = adminGender;
	}

	public static String getAdminAddress() {
		return AdminAddress;
	}

	public static void setAdminAddress(String adminAddress) {
		AdminAddress = adminAddress;
	}

	public static String getDob() {
		return dob;
	}

	public static void setDob(String dob) {
		Admin.dob = dob;
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public static String getAdminName() {
		return AdminName;
	}
	public static void setAdminName(String adminName) {
		AdminName = adminName;
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
	
	public Admin(int AdminId, String adminName, String AdminGender, String AdminAddress, String dob, String username, String password) {
		// TODO Auto-generated constructor stub
		this.AdminName = adminName;
		this.AdminGender = AdminGender;
		this.AdminAddress = AdminAddress;
		this.dob = dob;
		this.AdminId = AdminId;
		this.UserName = username;
		this.Password = password;
	}
	
	public Admin(int id, String username, String pass) {
		
	}
}
