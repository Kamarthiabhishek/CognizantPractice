package com.cts.beans;

import com.google.protobuf.Timestamp;

public class Registration {
	private static String CustomerName, Paymentstatus, PhoneNumber;
	private static int RegistrationId, RoomNumber;
	private static Timestamp ReservationTime;
	public static String getCustomerName() {
		return CustomerName;
	}
	
	public Registration(String customerName, String paymentSatus, String phonenumber, int id, int roomNo) {
		// TODO Auto-generated constructor stub
		this.CustomerName = customerName;
		this.Paymentstatus = paymentSatus;
		this.PhoneNumber = phonenumber;
		this.RegistrationId = id;
		this.RoomNumber = roomNo;
	}
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}

	public static String getPaymentstatus() {
		return Paymentstatus;
	}

	public static void setPaymentstatus(String paymentstatus) {
		Paymentstatus = paymentstatus;
	}

	public static String getPhoneNumber() {
		return PhoneNumber;
	}

	public static void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public static int getRegistrationId() {
		return RegistrationId;
	}

	public static void setRegistrationId(int registrationId) {
		RegistrationId = registrationId;
	}

	public static int getRoomNumber() {
		return RoomNumber;
	}

	public static void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}

	public static Timestamp getReservationTime() {
		return ReservationTime;
	}

	public static void setReservationTime(Timestamp reservationTime) {
		ReservationTime = reservationTime;
	}

	public static void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
}
