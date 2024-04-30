package ticketcalculation;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket t1 = new Ticket();
		System.out.println("Enter the no of bookings:");
		int bookings = sc.nextInt();
		
		System.out.println("Enter no of available tickets:");
		int availabletickets = sc.nextInt();
		t1.setAvailableTickets(availabletickets);
		
		for (int i = 0; i < bookings; i++) {
			System.out.println("Enter the ticketid:");
			int ticketid = sc.nextInt();
			t1.setTicketid(ticketid);
			
			System.out.println("Enter the cost:");
			int price = sc.nextInt();
			t1.setPrice(price);
			System.out.println("Enter the no of tickets:");
			int nooftickets = sc.nextInt();
			
			int rslt = t1.calculateTicketCost(nooftickets);
			System.out.println("Cost:"+rslt);
			
			int avail = t1.getAvailableTickets();
			System.out.println("Available tickets after booking:"+avail);
		}
	}
}
