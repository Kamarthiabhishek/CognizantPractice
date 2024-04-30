package Crop;

import java.util.Scanner;

public class Register {
	Scanner sc = new Scanner(System.in);
	private String name, address, gender, location;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Register(String name, String address, String gender, String location, int age) {
		// TODO Auto-generated constructor stub
		this.address =address;
		this.age= age;
		this.gender = gender;
		this.location = location;
		this.name = name;
	}
	
	public void registeruser() {
		
	}
}
