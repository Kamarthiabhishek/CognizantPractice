package com.cts.beans;

public class Customer {
	private int CustomerId;
	private String CustomerName;
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public Customer(int customerId, String customerName) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
}
