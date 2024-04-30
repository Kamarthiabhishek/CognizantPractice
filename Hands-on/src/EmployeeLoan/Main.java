package EmployeeLoan;

public class Main {
	public static void main(String[] args) {
		PermanentEmployee pe = new PermanentEmployee(123, "Abhishek", 12000);
		TemporaryEmployee te = new TemporaryEmployee(124, "Abhishek", 8,200);
		
		Loan l = new Loan();
		
		double perLoan = l.calculateLoanAmount(pe);
		double tempLoan = l.calculateLoanAmount(te);
		
		System.out.println(pe);
		System.out.println(te);
	}
}
