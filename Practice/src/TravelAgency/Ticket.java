package TravelAgency;

public class Ticket {
	private long pnrNo;
	private String passengeName, classType;
	private int seatNo;
	
	
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public String getPassengeName() {
		return passengeName;
	}
	public void setPassengeName(String passengeName) {
		this.passengeName = passengeName;
	}
	public long getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	
}
