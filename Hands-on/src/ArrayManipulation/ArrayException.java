package ArrayManipulation;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayException {
	
	public String getPriceDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		try {
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
		}catch (InputMismatchException e) {
			// TODO: handle exception
			return "input was in correct format";
		}
		int ele;
		System.out.println("Enter the index :");
		try {
			int index = sc.nextInt();
			ele = arr[index];
		}catch (InputMismatchException e) {
			// TODO: handle exception
			return "input was in correct format";
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return "Array index out of bound";
		}
		
		return "the element is " +ele;
	}	
	
	public static void main(String[] args) {
		ArrayException a = new ArrayException();
		String result = a.getPriceDetails();
	}
}
