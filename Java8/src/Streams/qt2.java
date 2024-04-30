package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class qt2 {
	
	// - Calculate the sum of all even numbers in a list of integers.

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		int lsum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(lsum);
		
		System.out.println(list);
		List<Integer> l1 = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(l1);
		int sum = l1.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		
		List<Integer> odd = list.stream().filter(n -> n%2!=0).collect(Collectors.toList());
		System.out.println(odd);
		
		
		List<Integer> numbers = Arrays.asList(234,3543,54365,4,645,6,4567,5,7);
		
		List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);

	}

}
