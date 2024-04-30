package RegisterCandidate;

public class Candidate {
	private String name, gender;
	private double expectedSalary;
	
	public double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Candidate(String name, String gender , double expectedSalary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.expectedSalary = expectedSalary;
		this.gender = gender;
	}
	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
}
