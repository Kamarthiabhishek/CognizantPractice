package AccountManupulation;

public class Main {
	public static void main(String[] args) {
		
		Customer c = new Customer(123, "Abhishek","abhishekkamarthi@gmail.com");
		SavingsAccount s = new SavingsAccount(9878132,c,12000,3000);
		System.out.println(s);
	}
}	
