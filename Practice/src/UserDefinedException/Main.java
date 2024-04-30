package UserDefinedException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		
		System.out.println("Enter the index for search : ");
		int index = sc.nextInt();
		
		if(index > arr.length){
			throw new IOException("Index out of bound");
		}
		
		System.out.println(arr[index]);
	}
}
