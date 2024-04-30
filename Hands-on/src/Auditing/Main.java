package Auditing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {
	
	private static HashMap<String, Double> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	public static HashMap<String, Double> getMap() {
		return map;
	}
	public static void setMap(HashMap<String, Double> map) {
		Main.map = map;
	}
	
	public void addEmployeeDetails(String employeeName, double salary) {
		map.put(employeeName, salary);
	}
	
	public static EmployeeAudit findEmployee() {
		EmployeeAudit emp = (double sal) -> {
			ArrayList<String> empNames = new ArrayList<>();
			for(Map.Entry<String, Double> names : map.entrySet()) {
				if(names.getValue() <= sal) {
					empNames.add(names.getKey());
				}
			}
			return empNames;
		};
		return emp;
	}
	
}
 