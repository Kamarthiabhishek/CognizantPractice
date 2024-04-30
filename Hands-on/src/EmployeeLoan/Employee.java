package EmployeeLoan;

public abstract class Employee {
	protected int employeeId,salary;
	protected String employeeName;
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(int employeeid, String employeeName) {
		// TODO Auto-generated constructor stub
		this.employeeId = employeeid;
		this.employeeName = employeeName;
	}
	
	public abstract void calculateSalary();
}
