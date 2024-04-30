package EmployeeLoan;

public abstract class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double Salary;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public Employee(int employeeId, String employeeName) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		// TODO Auto-generated constructor stub
	}
	
	public abstract void calculateSalary();
}
