package HostelDetails;

class Hosteller extends Student {
	private String hostelName;
	private int roomNumber;
	
	public String getHostelName() {
		return hostelName;
	}
	
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Hosteller() {
		// TODO Auto-generated constructor stub
	}
	
	public Hosteller(int studentId, String name, int departmentId, String gender,String phone,String hostelName, int roomNumber) {
		super.studentId = studentId;
		super.name= name;
		super.departmentId = departmentId;
		super.gender = gender;
		super.phone = phone;
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
}


