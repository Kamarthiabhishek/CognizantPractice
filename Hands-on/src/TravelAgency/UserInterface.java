package TravelAgency;

import java.util.Scanner;

public class UserInterface {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of passengers");
		int count = sc.nextInt();
		Ticket t = new Ticket();
		for(int i=1;i<=count;i++) {
			System.out.println("Details of passenger "+i);
			System.out.println("Enter the pnr no:");
			long pnr = sc.nextLong();
			t.setpnrNo(pnr);
			System.out.println("Enter passenger name:");
			String name = sc.next();
			t.setPassengerName(name);
			System.out.println("Enter seat no:");
			int seatno = sc.nextInt();
			t.setSeatNo(seatno);
			System.out.println("Enter class type:");
			String type = sc.next();
			t.setClassType(type);
			System.out.println("Enter ticket fare:");
			int fare = sc.nextInt();
			t.setTicketFare(fare);
			
			t = new Ticket(pnr, name, seatno, type, fare);
		}
		
		System.out.println("Commission obtained");
		CommisionInfo c = generateCommissionObtained();
		double sum =0;
		for(int i=0;i<count;i++) {
			sum += c.calculateCommisionAmount(t);
		}
		System.out.println(sum);
	}
	public static CommisionInfo generateCommissionObtained() {
		
		CommisionInfo ci = (t)->{
			String k = t.getClassType();
			if(k.equals("1A")|| k.equals("2A") || k.equals("3A")||k.equals("1a")|| k.equals("2a") || k.equals("3a")) {
				return 100;
			}else {
				return 60;
			}
			
		};
		return ci;
	}
}
