package TravelAgency;

import java.util.Scanner;

public class UserInterfaceClasss {
	public static CommisionInfo generateCommissionObtained() {
		CommisionInfo c = (t) -> {
			String k = (String)t.getClassType();
			if(k.equals("1A") || k.equals("2A") || k.equals("3A") || k.equals("1a") || k.equals("2a") || k.equals("3a")) {
				return 100;
			}else{
				return 60;
			}
		};
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of passengers : ");
		int count = sc.nextInt();
		
		Ticket[] t = new Ticket[count];
		
		for(int i=1;i<=count;i++) {
			System.out.println("Details of passenger "+i+" :");
			System.out.println("Enter the pnr : ");
			long pnrNo = sc.nextLong();
			System.out.println("Enter passenger name : ");
			String name = sc.next();
			System.out.println("Enter seat no:");
			int seatNo = sc.nextInt();
			System.out.println("Enter class type : ");
			String classType = sc.next();
			System.out.println("Enter ticket fare:");
			int fare = sc.nextInt();
			
			
		}
	}
}
