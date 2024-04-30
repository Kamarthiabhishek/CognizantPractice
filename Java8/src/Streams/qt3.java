package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class qt3 {

	// 1. find the longest String in the List
	// 2. find the largest number in the lsit

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Abhi", "Gokul", "Shiva", "Amrutha", "Divya", "Manisha");
		
		String res = list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(res);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> prime = num.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
		System.out.println(prime);
		
	}
}
