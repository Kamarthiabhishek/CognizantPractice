package Ekshitha;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =8;
		int[] fArr = new int[n];
		fArr[0]= 0;
		fArr[1]= 1;
		for(int i=2;i<n;i++) {
			fArr[i] = fArr[i-1]+fArr[i-2];
		}
//		for(int num : fArr) {
//			System.out.println(num+" ");
//		}
		int num = sc.nextInt();
		System.out.println(fArr[num-1]);
	}
}
