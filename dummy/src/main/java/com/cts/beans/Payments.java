package com.cts.beans;

public class Payments extends Registration{
	private static int Payment_id, amount;

	public static int getPayment_id() {
		return Payment_id;
	}

	public static void setPayment_id(int payment_id) {
		Payment_id = payment_id;
	}

	public static int getAmount() {
		return amount;
	}

	public static void setAmount(int amount) {
		Payments.amount = amount;
	}
	
	public Payments(int id , int amt) {
		// TODO Auto-generated constructor stub
		this.Payment_id = id;
		this.amount = amt;
	}
}
