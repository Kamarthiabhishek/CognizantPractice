package Phonemanipulation;

public class Contact {
	private String firstName, lastname,emailId;
	private long phoneNumber;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Contact(String fName, String lName, String emailId, long phoneNumber) {
		// TODO Auto-generated constructor stub
		this.firstName = fName;
		this.lastname = lName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}
}
