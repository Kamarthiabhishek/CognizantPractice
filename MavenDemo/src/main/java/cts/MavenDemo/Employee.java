package cts.MavenDemo;

public class Employee {
	private String EmpID, EmpName, EmpGendeer, EmpAddress, Email;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	
	public String getEmpGendeer() {
		return EmpGendeer;
	}
	public void setEmpGendeer(String empGendeer) {
		EmpGendeer = empGendeer;
	}
	
	public String getEmpID() {
		return EmpID;
	}
	public void setEmpID(String empID) {
		EmpID = empID;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
	
	public Employee(String EmpId, String EmpName , String Gender, String EmpAddress, String Email) {
		// TODO Auto-generated constructor stub
		this.Email = Email;
		this.EmpAddress = EmpAddress;
		this.EmpGendeer = Gender;
		this.EmpID = EmpId;
		this.EmpName = EmpName;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
