package Simple_programs;

import java.util.*;

public class add {
	public static void main(String[] args) {
		System.out.println("ENTER THE VALUES OF a AND b");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		int diff = a-b;
		int mul = a*b;
		int div = a/b;
		int mod =a%b;
		
		System.out.println("sum ="+ sum);
		System.out.println("diff ="+ diff);
		System.out.println("mul ="+ mul);
		System.out.println("div ="+ div);
		System.out.println("mod ="+ mod);
	}
}
