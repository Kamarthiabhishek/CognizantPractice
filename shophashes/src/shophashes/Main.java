package shophashes;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		ArrayList<Integer> cost = new ArrayList<>();

		map.put(100, "Chocolate");
		map.put(20, "Mazza");
		map.put(15, "Kukure");

		boolean b = true;
		do {
			System.out.println("Enter the product name : ");
			String name = sc.next();
			System.out.println("Enter the quantity : ");
			int qty = sc.nextInt();
			int sum = 0;
			for (Map.Entry<Integer, String> e : map.entrySet()) {
				if (e.getValue().equals(name)) {
					int price = e.getKey();
					int total = price * qty;
					System.out.println(price);
					System.out.println(total);
//					cost.add(total);
					sum = sum + total;
					System.out.println(sum);
					System.out.println("Y|N");
					char ch = sc.next().charAt(0);
					if (ch == 'Y') {
						b = true;
					} else {
						b = false;
					}
				} else {
					System.out.println("Product not found");
				}
			}
		} while (b);
	}
}
