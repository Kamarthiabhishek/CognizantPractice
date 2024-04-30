package ticketcalculation;

public class Ticket {
	private int ticketid,price;
	private static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets >0 ) {
			Ticket.availableTickets = availableTickets;
		}else {
			System.out.println("Wrong Input");
		}
	}
	public int calculateTicketCost(int nooftickets) {
		if(nooftickets < availableTickets) {
			availableTickets -= nooftickets;
			int totalcost = nooftickets * price;
			return totalcost;
		}else {
			return -1;
		}
	}
}
