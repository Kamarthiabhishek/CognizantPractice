package EmployeeLoan;

public class Loan {
	public double calculateLoanAmount(Employee empObj) {
		if(empObj instanceof PermanentEmployee) {
			return empObj.getSalary() * 0.15;
		}else if(empObj instanceof TemporarayEmployee) {
			return empObj.getSalary() * 0.1;
		}
		return 0;
	}
}
