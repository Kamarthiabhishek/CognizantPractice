package EmployeeLoan;

public class Main {
	public static void main(String[] args) {
		PermanentEmployee p = new PermanentEmployee(123,"Abhishek",1000);
		TemporarayEmployee t = new TemporarayEmployee(423,"Abhishek",3, 100);
		Loan l = new Loan();
		double Ploan = l.calculateLoanAmount(p);
		double Tloan = l.calculateLoanAmount(t);
		
		System.out.println("Permanent Employee Loan : "+Ploan);
		System.out.println("Temporary Employee Loan : "+Tloan);
	}
}
