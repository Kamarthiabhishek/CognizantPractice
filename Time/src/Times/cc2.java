package Times;

import java.util.Scanner;

public class cc2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int M = sc.nextInt();
		int N =sc.nextInt();
		
		if(M< N) {
			System.out.println(M+" is not less than "+N);
		}
	}
}
