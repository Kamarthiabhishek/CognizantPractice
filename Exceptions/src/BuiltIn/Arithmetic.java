package BuiltIn;

public class Arithmetic {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			
			int c = a/b;
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Cannot divide by 0");
		}
	}
}
