import java.sql.*;
import java.util.Scanner;

import DBServices.DButils;
import cts.MavenDemo.Demo;
import cts.MavenDemo.Employee;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the Employee Details : ");
    	System.out.print("Enter the Employee Id : ");
    	String EmpId = s.next();
    	System.out.print("Enter the Employee Name : ");
    	String EmpName = s.next();
    	
    	Demo d = new Demo(EmpId, EmpName);
    	
    	DButils db = new DButils();
    	boolean res = db.Insert();
    	if(res) {
    		System.out.println("Success!!");
    	}else {
    		System.out.println("Failed addding to DATABASE");
    	}
    	
    	
    }
}