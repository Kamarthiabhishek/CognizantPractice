import java.util.Scanner;

public class highestplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int cse = sc.nextInt();
		int ece =  sc.nextInt();
		int mech = sc.nextInt();
		System.out.println("Highest placement");
		
		if(cse > ece) {
			if(cse > mech) {
				System.out.println("CSE");
			}
			else if(mech > cse) {
				System.out.println("Mech");
			}
		}else {
			System.out.println("ECE");
		}

	}

}
