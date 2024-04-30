import java.util.Scanner;

public class IntAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		char ascii1 = (char)num1;
		char ascii2 = (char)num2;
		char ascii3 = (char)num3;
		char ascii4 = (char)num4;
		
		System.out.println(ascii1);
		System.out.println(ascii2);
		System.out.println(ascii3);
		System.out.println(ascii4);
	}

}
