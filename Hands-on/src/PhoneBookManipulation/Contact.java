package PhoneBookManipulation;

public class Contact {
	private String firstName,lastName,emailId;
	private long phoneNumber;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Contact(String firstName , String lastName, String emailId, long phoneNumber) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}
	
	
	public Contact(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}
}
