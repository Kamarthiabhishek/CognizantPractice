package VehicleLoan;

public class Main {
	public static void main(String[] args) {
		Vehicle v = new Vehicle("KA34EP9843", 	"Activa 6G", "2 wheeler", 98000);
				
		
		double loan = v.issueloan();
		double insurance = v.takeInsurance();
		
		System.out.println(loan);
		System.out.println(insurance);
	}
}
