package oops;

import java.util.Scanner;

class Demo{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String Concates(String name , int age ) {
		String result = name + age;
		return result;
	}
}

public class Encapsulation1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Demo d = new Demo();
		int age;
		System.out.print("Enter the name : ");
		String name = sc.next();
		d.setName(name);
		
		boolean valid = true;
		while(valid) {
			System.out.print("Enter the age : ");
			age = sc.nextInt();
			if(age >0) {
				d.setAge(age);
				String rslt = d.Concates(name, age);
				System.out.println(rslt);
				valid = false;
			}else {
				valid = true;
				System.out.println("Enter the correct age!");
			}
		}
		sc.close();
	}
}
