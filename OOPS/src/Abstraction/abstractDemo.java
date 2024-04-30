package Abstraction;

abstract class Animal{
	abstract void walk();
	
	public void eat() {
		System.out.println("Animal eats!");
	}
}

class Horse extends Animal{
	public void walk() {
		System.out.println("horse walks on 4 legs");
	}
}
public class abstractDemo {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.walk();
	}
}
