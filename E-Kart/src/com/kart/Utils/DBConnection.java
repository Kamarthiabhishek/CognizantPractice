package com.kart.Utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/ekart";
			Connection con = DriverManager.getConnection(url,"root","root");
			PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO DEPT VALUES(?,?,?)");
			preparedStatement.setInt(1, 01);
			preparedStatement.setString(2, "IT");
			preparedStatement.setString(3, "Main Block");
			
			preparedStatement.execute();
			System.out.println("Success!!");
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
