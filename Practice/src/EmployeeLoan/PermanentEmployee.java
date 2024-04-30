package EmployeeLoan;

public class PermanentEmployee extends Employee{
	private double basicPay;
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public PermanentEmployee(int employeeId, String employeeName , double basicPay) {
		// TODO Auto-generated constructor stub
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double PFAmount = basicPay * 0.12;
		double salary = basicPay - PFAmount;
	}
}
