package Abstraction;

public class AbstractMain {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		String result = d.Legs();
		System.out.println(result);
		
		Cat c = new Cat();
		String cat = c.Legs();
		System.out.println(cat);
	}
}
