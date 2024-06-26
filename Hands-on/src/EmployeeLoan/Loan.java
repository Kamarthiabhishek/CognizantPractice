package EmployeeLoan;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			return employeeObj.salary*0.15;
		}else if(employeeObj instanceof TemporaryEmployee) {
			return employeeObj.salary*0.1;
		}
		
		return -1;
	}
}
