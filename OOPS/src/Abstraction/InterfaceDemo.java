package Abstraction;

interface Animal1{
	void walk();
}

class Horse1 implements Animal1{
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Horse1 h1 = new Horse1();
		h1.walk();
	}
}
