package com.cts.beans;

public class Admin {
	private int AdminId;
	private String Name;
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(int adminId, String name) {
		super();
		AdminId = adminId;
		Name = name;
	}
	
	
}
