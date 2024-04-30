package sorting;

import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("enter the values : ");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			boolean isSwapped = false;
			for(int j=0;j<5-1-i;j++) {
				if(arr[i] > arr[j+1]) {
					int temp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
				if(isSwapped == false) {
					
					
					break;
				}
			}
		}
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
