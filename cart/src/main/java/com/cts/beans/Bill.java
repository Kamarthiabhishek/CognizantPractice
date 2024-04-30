package com.cts.beans;

public class Bill {
	private int BillId;

	public int getBillId() {
		return BillId;
	}

	public void setBillId(int billId) {
		BillId = billId;
	}

	public Bill(int billId) {
		super();
		BillId = billId;
	}
	
	
	public Bill() {
		// TODO Auto-generated constructor stub
	}
}
