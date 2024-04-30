import java.util.Scanner;

public class placement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no students placed in CSE : ");
		int cse = s.nextInt();
		System.out.print("Enter the no students placed in ECE : ");
		int ece = s.nextInt();
		System.out.print("Enter the no students placed in MECH : ");
		int mech = s.nextInt();
		
		if(cse<0 || ece<0 || mech<0) {
			System.out.println("Input Invalid");
			return;
		}
		if(cse==ece && ece==mech && mech==cse) {
			System.out.println("None of the department has got the highest placement");
			return;
		}
		System.out.println("Highest placement");
		if(cse==ece) {
			System.out.println("CSE");
			System.out.println("ECE");
		}else if(cse==mech) {
			System.out.println("CSE");
			System.out.println("MECH");
		}else if(ece==mech) {
			System.out.println("ECE");
			System.out.println("MECH");
		}
		else if(cse>ece) {
			if(cse>mech) {
				System.out.println("CSE");
			}else {
				System.out.println("MECH");
			}
		}else {
			if(ece>cse) {
				if(ece>mech) {
					System.out.println("ECE");
				}
			}
		}
		
	}

}
