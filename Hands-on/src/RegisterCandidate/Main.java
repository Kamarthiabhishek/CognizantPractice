package RegisterCandidate;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try {
			Candidate c = getCandidateDetails();
			System.out.println("Registration Successful");
		}catch (InvalidSalaryException e) {
			// TODO: handle exception
			System.out.println("Registration failed");
			System.out.println("Error "+e.getMessage());
		}
	}
	public static Candidate getCandidateDetails() throws InvalidSalaryException{
		Scanner sc = new Scanner(System.in);
		Candidate c = new Candidate();
		System.out.println("Enter the candidate Details");
		System.out.println("Name");
		String Cname = sc.next();
		c.setName(Cname);
		System.out.println("Gender");
		String Cgender = sc.next();
		c.setGender(Cgender);
		System.out.println("Expected salary");
		double sal = sc.nextInt();
		c.setExpectedSalary(sal);
				
		if(sal < 10000) {
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
		}
		c =  new Candidate(Cname, Cgender, sal);
		return c;
	}
}
