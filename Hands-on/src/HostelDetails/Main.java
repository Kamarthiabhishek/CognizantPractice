package HostelDetails;

import java.util.Scanner;

public class Main{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Hosteller h = getHostellerDetails();
		
		if(h != null) {
			System.out.println(h.getStudentId() +" "+h.getName()+" "+h.getDepartmentId()+" "+h.getGender()+" "+h.getPhone()+" "
			+h.getHostelName()+" "+h.getRoomNumber());
		}
	}
	
	public static Hosteller getHostellerDetails() {
		
		Hosteller h = new Hosteller();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details:");
		System.out.println("Student Id:");
		int studentId =sc.nextInt();
		h.setStudentId(studentId);
		System.out.println("Student name:");
		String name = sc.next();
		h.setName(name);
		System.out.println("Department Id:");
		int departmentId = sc.nextInt();
		h.setDepartmentId(departmentId);
		System.out.println("Gender:");
		String gender = sc.next();
		h.setGender(gender);
		System.out.println("Phone number:");
		String phone =sc.next();
		h.setPhone(phone);
		System.out.println("Hostel Name:");
		String hostelname = sc.next();
		h.setHostelName(hostelname);
		System.out.println("Room Number:"	);
		int roomNumber = sc.nextInt();
		h.setRoomNumber(roomNumber);
		sc.nextLine();
		
		System.out.println("Modify Room Number (Y/N):");
		char modifyroom = sc.next().charAt(0);
		if(modifyroom == 'Y' || modifyroom == 'y') {
			System.out.println("New Room Number: ");
			int newNo = sc.nextInt();
			h.setRoomNumber(newNo);
		}
		
		System.out.println("Modify Phone Number (Y/N):");
		char modifyPhone = sc.next().charAt(0);
		if(modifyPhone == 'Y' || modifyPhone == 'y') {
			System.out.println("New Phone Number: ");
			String newNo = sc.nextLine();
			h.setPhone(newNo);
		}
		
		h = new  Hosteller(studentId, name, departmentId, gender, phone, hostelname, roomNumber);
		
		return h;
	}
}
