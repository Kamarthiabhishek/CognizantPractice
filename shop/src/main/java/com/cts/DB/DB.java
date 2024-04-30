package com.cts.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
	public static Connection con;
	public PreparedStatement preparedStatement;
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/demo1";
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
			System.out.println("Something went wrong!!");
			return false;
		}
	}

	public static boolean ReadAll() {
		try {
			String sql = "SELECT * FROM PRODUCTS";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (!rs.next()) {
				System.out.println("Empty");
			} else {
				do {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int price = rs.getInt("price");
					System.out.println("ID : " + id + "Name : " + name + "Price : " + price);
				} while (rs.next());

			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Something went wrong!!");
			return false;
		}

	}
	
	
	public void add2cart(int pid) {
		
	}

}
