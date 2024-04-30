package com.cts.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cts.beans.Payments;
import com.cts.beans.Registration;
import com.google.protobuf.Timestamp;

public class dbOperations {
	public static Connection con;
	public static PreparedStatement preparedStatement;
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/ebill";
	public static String username = "root";
	public static String password = "root";

	// DB Connection
	public static boolean Connect2DB() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			// System.out.println("Something went wrong!!");
			return false;
		}
	}

	public static boolean insert() {
		try {
			java.sql.Timestamp time = new java.sql.Timestamp(System.currentTimeMillis());
			String sql = "INSERT INTO RESERVATION VALUES(?,?,?,?,?,?)";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, Registration.getRegistrationId());
			preparedStatement.setString(2, Registration.getCustomerName());
			preparedStatement.setString(3, Registration.getPhoneNumber());
			preparedStatement.setTimestamp(4, time);
			preparedStatement.setInt(5, Payments.getRoomNumber());
			preparedStatement.setString(6, Payments.getPaymentstatus());

			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	public static boolean makePayment() {
		try {
			java.sql.Timestamp time = new java.sql.Timestamp(System.currentTimeMillis());
			String sql = "INSERT INTO PAYMENT VALUES(?,?,?)";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, Payments.getPayment_id());
			preparedStatement.setInt(2, Payments.getAmount());
			preparedStatement.setTimestamp(3, time);
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			return false;
		}
	}

	public static boolean updateDetails(int registerId, String status) {
		try {
			String sql = "UPDATE RESERVATION SET PAYMENTSTATUS = ? WHERE RESERVATIONID =?";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,status);
			preparedStatement.setInt(2, registerId);
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
}
