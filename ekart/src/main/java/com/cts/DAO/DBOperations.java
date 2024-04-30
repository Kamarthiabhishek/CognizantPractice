package com.cts.DAO;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.cts.models.Admin;
import com.cts.models.Customer;
import com.cts.models.Products;

public class DBOperations {
	public Connection con;
	public PreparedStatement preparedStatement;
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/ecart";
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

	// All tables -------------------------------------- Insertion
	public boolean Insert2Table(String tableName) {
		if (tableName.equals("PRODUCTS")) {

			String sql = "INSERT INTO PRODUCTS VALUES(?,?,?,?,?)";
			try {
				Connect2DB();
				preparedStatement = con.prepareStatement(sql);
				preparedStatement.setInt(1, Products.getProdId());
				preparedStatement.setString(2, Products.getProdName());
				preparedStatement.setString(3, Products.getProdDesciption());
				preparedStatement.setInt(4, Products.getQuantity());
				preparedStatement.setInt(5, Products.getPrice());

				preparedStatement.execute();

				return true;
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("Something went wrong!!");
				return false;
			}
		} else if (tableName.equals("CUSTOMER")) {

			String sql = "INSERT INTO CUSTOMER VALUES (?,?,?,?,?,?,?)";
			try {
				Connect2DB();
				preparedStatement = con.prepareStatement(sql);
				preparedStatement.setInt(1, Customer.getCustomerId());
				preparedStatement.setString(2, Customer.getCustomerName());
				preparedStatement.setString(3, Customer.getCustomerGender());
				preparedStatement.setString(4, Customer.getCustomerAddress());
				preparedStatement.setString(5, Customer.getDob());
				preparedStatement.setString(6, Customer.getUserName());
				preparedStatement.setString(7, Customer.getPassword());
				preparedStatement.execute();
				return true;
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("Something went wrong!!");
				return false;
			}
		} else if (tableName.equals("ADMIN")) {

			String sql = "INSERT INTO ADMIN VALUES (?,?,?,?,?,?,?)";
			try {
				Connect2DB();
				preparedStatement = con.prepareStatement(sql);
				preparedStatement.setInt(1, Admin.getAdminId());
				preparedStatement.setString(2, Admin.getAdminName());
				preparedStatement.setString(3, Admin.getAdminGender());
				preparedStatement.setString(4, Admin.getAdminAddress());
				preparedStatement.setString(5, Admin.getDob());
				preparedStatement.setString(6, Admin.getUserName());
				preparedStatement.setString(7, Admin.getPassword());
				preparedStatement.execute();
				return true;
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("Something went wrong!!");
				return false;
			}
		}
		return false;
	}

	// Admin operation ---------------------Updating
	public boolean UpdatePrice(String id, int amt) {
		try {
			preparedStatement = con.prepareStatement("UPDATE PRODUCTS SET PRICE = ? WHERE PRODUCT_ID = ?");
			preparedStatement.setInt(1, amt);
			preparedStatement.setString(2, id);
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Something went wrong!!");
			return false;
		}
	}

	// Admin operation ------------- Deletion
	public boolean DeleteProduct(String Id) {
		try {
			preparedStatement = con.prepareStatement("DELETE FROM PRODUCTS WHERE PRODUCT_ID = ?");
			preparedStatement.setString(1, Id);
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Something went wrong!!");
			return false;
		}
	}

	// Customer and Admin operation ------------Display all the values
	public boolean ReadAll() {
		try {
			String sql = "SELECT * FROM PRODUCTS";
			preparedStatement = con.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			System.out.println("-".repeat(70));
			System.out.println("PID"+" ".repeat(6)+"Name"+" ".repeat(15)+"Description"+" ".repeat(10)+"Quantity"+" ".repeat(5)+"Price");
			System.out.println("-".repeat(70));
			while (rs.next()) {
				String id = rs.getString("PRODUCT_ID");
				String name = rs.getString("PRODUCT_NAME");
				String descrip = rs.getString("PRODUCT_CATEGORY");
				int qty = rs.getInt("QUANTITY");
				int price = rs.getInt("PRICE");

//				System.out.println("|" + id + "|" + name + " 		|" + descrip + " 		|" + qty
//						+ "	 		|" + price + " 		|");
//				
				System.out.printf("%-8s %-18s %-21s %-15s %-2s\n",id,name,descrip,qty,price);
			}
			System.out.println("-".repeat(70));
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Something went wrong!!");
			return false;
		}

	}

	// Customer and Admin operation ------------------------ Searching1
	public boolean SearchUsingID(String id) {
		try {
			preparedStatement = con.prepareStatement("SELECT * FROM PRODUCTS WHERE PRODUCT_ID = ?");
			preparedStatement.setString(1, id);
			ResultSet rs = preparedStatement.executeQuery();

			System.out.println(
					"+-------------------------------------------------------------------------------------------------------+");
			System.out.println("|ID 		|NAME	 		|CATEGORY 		|QUANTITY 		|PRICE 		|");
			System.out.println(
					"+-------------------------------------------------------------------------------------------------------+");
			while (rs.next()) {
				String pid = rs.getString("PRODUCT_ID");
				String name = rs.getString("PRODUCT_NAME");
				String descrip = rs.getString("PRODUCT_CATEGORY");
				int qty = rs.getInt("QUANTITY");
				int price = rs.getInt("PRICE");

				System.out.println("|" + pid + " 		|" + name + " 		|" + descrip + " 		|" + qty
						+ "	 		|" + price + " 		|");

			}
			System.out.println(
					"+-------------------------------------------------------------------------------------------------------+");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong!!");
			return false;
		}
	}

	// Admin and Customer operation ------------------------ Searching2
	public boolean SearchUsingCat(String cat) {
		try {
			preparedStatement = con.prepareStatement("SELECT * FROM PRODUCTS WHERE PRODUCT_CATEGORY = ?");
			preparedStatement.setString(1, cat);
			ResultSet rs = preparedStatement.executeQuery();
			System.out.println(
					"+-------------------------------------------------------------------------------------------------------+");
			System.out.println("|ID 		|NAME	 		|CATEGORY 		|QUANTITY 		|PRICE 		|");
			System.out.println(
					"+-------------------------------------------------------------------------------------------------------+");
			while (rs.next()) {
				String id = rs.getString("PRODUCT_ID");
				String name = rs.getString("PRODUCT_NAME");
				String descrip = rs.getString("PRODUCT_CATEGORY");
				int qty = rs.getInt("QUANTITY");
				int price = rs.getInt("PRICE");

				System.out.println("|" + id + " 		|" + name + " 		|" + descrip + " 		|" + qty
						+ "	 		|" + price + " 		|");

			}
			System.out.println(
					"+-------------------------------------------------------------------------------------------------------+");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			System.out.println("Something went wrong!!");
			return false;
		}
	}

	public boolean Filter(int price, int price1) {
		try {
			preparedStatement = con
					.prepareStatement("SELECT PRODUCT_ID , PRODUCT_NAME FROM PRODUCTS WHERE PRICE BETWEEN ? AND ?");
			preparedStatement.setInt(1, price);
			preparedStatement.setInt(2, price1);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				String pid = rs.getString("PRODUCT_ID");
				String name = rs.getString("PRODUCT_NAME");

				System.out.println("PRODUCT_ID : " + pid + " PRODUCT_NAME : " + name);
			}
			return true;

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Something went wrong!!");
			return false;
		}
	}

	public boolean loginAdmin(String username, String password, String tablename) {
		if (tablename.equals("ADMIN")) {
			try {
				Connect2DB();
				preparedStatement = con.prepareStatement("select * from admin where username=? AND password=?");

				preparedStatement.setString(1, username);
				preparedStatement.setString(2, password);

				ResultSet rs = preparedStatement.executeQuery();

				if (rs.next()) {
					return true;
				} else {
					System.out.println("Invalid Credentials!!!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		} else if (tablename.equals("CUSTOMER")) {
			try {
				Connect2DB();
				preparedStatement = con.prepareStatement("select * from customer where username=? AND password=?");

				preparedStatement.setString(1, username);
				preparedStatement.setString(2, password);

				ResultSet rs = preparedStatement.executeQuery();

				if (rs.next()) {
					return true;
				} else {
					System.out.println("Invalid Credentials!!!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}

	public boolean orderProduct(int cid, int qty) {
		int OrderId = generator();
		try {
			String sql = "INSERT INTO ORDERS VALUES(?,?,?)";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, OrderId);
			preparedStatement.setInt(2, cid);
			preparedStatement.setInt(3, qty);

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

	public int getPrices(int id) {
		try {
			Connect2DB();
			String sql = "SELECT PRICE FROM PRODUCTS WHERE PRODUCT_ID = ?";
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

	public boolean getLoginId(int id, String pass,String name) {
		try {
			Connect2DB();
			if(name.equals("CUSTOMER")) {
				String sql = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = ? AND PASSWORD = ?";
				preparedStatement = con.prepareStatement(sql);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, pass);

				ResultSet rs = preparedStatement.executeQuery();

				if (rs.next()) {
					return true;
				} else {
					return false;
				}
			}else if(name.equals("ADMIN")) {
				String sql = "SELECT * FROM ADMIN WHERE ADMIN_ID = ? AND PASSWORD = ?";
				preparedStatement = con.prepareStatement(sql);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, pass);

				ResultSet rs = preparedStatement.executeQuery();

				if (rs.next()) {
					return true;
				} else {
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return false;
	}

	public static int generator() {
		Random r = new Random();
		int num = r.nextInt(9000) + 1000;
		return num;
	}
}
