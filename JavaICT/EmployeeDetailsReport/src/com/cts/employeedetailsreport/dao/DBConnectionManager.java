package com.cts.employeedetailsreport.dao;


import java.io.FileInputStream;
import java.sql.Connection;

import com.cts.employeedetailsreport.exception.InvalidEmployeeNumberException;


public class DBConnectionManager {


	 
	 private static Connection con = null;
	 private static DBConnectionManager instance;
	public  DBConnectionManager()  throws InvalidEmployeeNumberException
	{
		FileInputStream fis=null;
		 
		//FILL THE CODE HERE
	}
	public static DBConnectionManager getInstance() throws InvalidEmployeeNumberException {
		//FILL THE CODE HERE

		return instance;
	}
	public Connection getConnection() {
		return con;
	}
}
