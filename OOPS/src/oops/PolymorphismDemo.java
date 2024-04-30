package oops;
import java.lang.*;
import java.util.Scanner;
class std {
	int age;
	String name;

	std() {
		System.out.println("Constructor executed");
	}
	
	std(String name, int age){
		
	}
	public void printInfo() {
		System.out.println("");
	}

	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name) {
		System.out.println(age);
	}
	public void printInfo(int age, String name) {
		System.out.println(name + " " +age);
	}
	
	public void setter(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	
}

public class PolymorphismDemo {
	// Poly - many morphism - forms
	// A single function having multiple characteristics.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		std s1 = new std();
		System.out.println("Object1 called");
		std s2 = new std();
		System.out.println("Object2 called");
		String name = sc.next();
		int age = sc.nextInt();
		
		s1.setter(age, name);
		
	}

}
