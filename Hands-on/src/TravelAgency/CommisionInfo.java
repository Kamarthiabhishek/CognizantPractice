package TravelAgency;

@FunctionalInterface
public interface CommisionInfo {
	public double calculateCommisionAmount(Ticket ticketObj);
}
