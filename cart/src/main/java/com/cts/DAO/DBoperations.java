package com.cts.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.cts.beans.Orders;
import com.cts.beans.Products;

public class DBoperations {
	public Connection con;
	public PreparedStatement preparedStatement;
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/shop";
	public static String username = "root";
	public static String password = "root";

	// DB Connection
	public boolean Connect2DB() {
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

	public boolean Insert() {
		Connect2DB();
		Products p = new Products();
		try {
			String sql = "INSERT INTO PRODUCTS VALUES (?,?,?,?)";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, p.getProductId());
			preparedStatement.setString(2, p.getProductName());
			preparedStatement.setInt(3, p.getPrice());
			preparedStatement.setInt(4, p.getQty());

			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	public boolean show() {
		Connect2DB();
		String sql = "SELECT * FROM PRODUCTS";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				int qty = rs.getInt("qty");

				System.out.println("ID : " + id + "NAME : " + name + "PRICE : " + price + "QUANTITY : " + qty);

			}
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	public int getPrices(int id) {
		try {
			String sql = "SELECT PRICE FROM PRODUCTS WHERE ID = ?";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			int price;
			if (rs.next()) {
				price = rs.getInt("price");
				return price;
			} else {
				System.out.println("Product not found!!!");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		return 0;
	}

	public boolean getLoginId(int id) {
		try {
			Connect2DB();

			String sql = "SELECT * FROM CUSTOMER WHERE ID = ?";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	public boolean orderProduct(int cid, int pid, int qty) {
		int OrderId = generator();
		try {
			String sql = "INSERT INTO ORDERS VALUES(?,?,?,?)";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, OrderId);
			preparedStatement.setInt(2, cid);
			preparedStatement.setInt(3, pid);
			preparedStatement.setInt(4, qty);

			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}

	}

	public boolean Billing(int cid, int cost) {
		try {
			Connect2DB();
			String sql = "INSERT INTO BILL VALUES(?,?,?)";
			int BillId = generator();

			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, BillId);
			preparedStatement.setInt(2, cid);
			preparedStatement.setInt(3, cost);

			preparedStatement.execute();

			return true;

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	public static int generator() {
		Random r = new Random();
		int num = r.nextInt(9000) + 1000;
		return num;
	}
}
