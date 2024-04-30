package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class qt1 {
	
//	- Given a list of strings, filter out the strings that start with the letter "A" 
	//and convert them to uppercase.
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Abhi");
		list.add("Gokul");
		list.add("Shiva");
		list.add("Amrutha");
		list.add("Divya");
		list.add("Manisha");
		
			  
		System.out.println(list);
		
		List<String> l2 = list.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		System.out.println(l2);
		
		List<String> l1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(l1);
		
		String conc = list.stream().collect(Collectors.joining());
		System.out.println(conc);
		
		//combining both functions
		
		List<String> result = list.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(result);
	}
	
	
}
