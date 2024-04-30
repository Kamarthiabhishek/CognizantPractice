package AccountManupulation;

public class Customer {
	private int customerId;
	private String customername,emailId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Customer(int customerId , String customerName,String Email) {
		// TODO Auto-generated constructor stub
		this.customerId = customerId;
		this.customername = customerName;
		this.emailId = Email;
	}
}
