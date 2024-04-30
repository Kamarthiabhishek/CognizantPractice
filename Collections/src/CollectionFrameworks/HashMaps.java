package CollectionFrameworks;

import java.util.*;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		// Inserting the value into HashMap
		map.put("India", 121);
		map.put("China", 180);
		map.put("Bangladesh", 25);
		map.put("US", 30);
		map.put("Bangladesh", 10);
		System.out.println(map);

		// Size of the HashMap
		System.out.println(map.size());

		// Searching
		System.out.println("Enter the value to search");
		String value = sc.next();
		if (map.containsValue(10)) {
			System.out.println("Containds the value " + value);
		} else {
			System.out.println("Does'nt contain");
		}

		// Get the value using the key
		System.out.println(map.get(value));

		// Remove the element
		map.remove(value);
		System.out.println(map);

		// Iteration in the HashMap
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		
		LinkedHashMap<Integer, String> lhap = new LinkedHashMap<>();
		
		lhap.put(10, "Abhishek");
		

	}
}
