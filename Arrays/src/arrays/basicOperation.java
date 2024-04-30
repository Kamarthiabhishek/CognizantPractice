package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class basicOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creating a 1D Array and printing the values in the array
		
		System.out.print("Enter the size of 1D array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		//Inputting the values into the array
		
		System.out.println("Enter the values : ");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		//Printing the values of the array 
		
		System.out.print("1D array values : ");
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]);
			System.out.println();
		}
		
		//Creating a 2D Array and printing the values in the array
		System.out.print("Enter the size of 2D array : ");
		int n1 = sc.nextInt();
		System.out.print("Enter the size of 2D array : ");
		int n2 = sc.nextInt();
		int[][] arr2 = new int[n1][n2];
		
		//Inputting the values into the array
		
		System.out.println("Enter the values : ");
		for(int i=0;i<n1-1;i++) {
			for(int j=0;j<n2;j++) {
				arr2[i][j]= sc.nextInt();
			}
		}
		
		//Printing the values of the array 
		
		System.out.println("2D array values : ");
		for(int i=0;i<n1-1;i++) {
			for(int j=0;j<n2;j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		
		//Enhanced for loop to print the values
		
		System.out.println("Enhanced for loop 1D output");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		System.out.println("Enhanced for loop 2D output");
		for(int[] ele1 : arr2) {
			for(int ele : ele1) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		
		//Sorting the array using the keyword
		int[] arr1 = {2,421,14,5,2,1,0};
		Arrays.sort(arr1);
		
		for(int element : arr1) {
			System.out.println(element + " ");
		}
	
		//Reversing the array elements
		
		System.out.println("Enter the size of the array : ");
		int m = sc.nextInt();
		int[] arrr = new int[m];
		System.out.println("Enter the values  : ");
		for(int i=0;i<=m-1;i++) {
			arrr[i] = sc.nextInt();
		}
		for(int i=m-1;i>=0;i--) {
			System.out.println(arrr[i]);
		}
	}
}
