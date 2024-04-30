package TravelAgency;

public class Ticket {
	long pnrNo;
	String passengerName, classType;
	int seatNo;
	double ticketFare;
	
	
	public long getpnrNo() {
		return pnrNo;
	}
	public void setpnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	public double getTicketFare() {
		return ticketFare;
	}
	public void setTicketFare(double ticketFare) {
		this.ticketFare = ticketFare;
	}
	
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	public Ticket(long phoneNumber, String passengerName, int seatNo,String classType, double ticketFare) {
		// TODO Auto-generated constructor stub
		this.pnrNo = phoneNumber;
		this.classType = classType;
		this.passengerName = passengerName;
		this.ticketFare = ticketFare;
		this.seatNo = seatNo;
	}
	
	public Ticket() {
		
	}
}
