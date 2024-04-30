package EmployeeLoan;

public class TemporaryEmployee extends Employee{
	private int hoursWorked, hourlyWages;
	
	public int getHourlyWages() {
		return hourlyWages;
	}
	
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked, int hourlyWages) {
		// TODO Auto-generated constructor stub
		super(employeeId, employeeName);
		this.hourlyWages = hourlyWages;
		this.hoursWorked = hourlyWages;
	}
	
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double salary = hoursWorked * hourlyWages;
	}
}