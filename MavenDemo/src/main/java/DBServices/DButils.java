package DBServices;
import java.sql.*;

import cts.MavenDemo.Demo;
import cts.MavenDemo.Employee;

import java.io.IOException;
import java.sql.*;

public class DButils {
	
	public boolean Insert() {
		
		String url = "jdbc:mysql://localhost:3306/demo1";
		try {
			Demo demo = new Demo();
			Connection con = DriverManager.getConnection(url,"root","root");
			PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?)");
			preparedStatement.setString(1, demo.getId());
			preparedStatement.setString(2, demo.getName());
			preparedStatement.execute();
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean Delete(String EmpId) {
		try {
			Demo demo = new Demo();
		}
		return true;
	}
}
