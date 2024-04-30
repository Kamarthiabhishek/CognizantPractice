package InsuranceBazar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UI {

	public static void main(String[] args) {
		Baazar b = new Baazar();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of policy names you want to add");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the policy ID");
			int policyId = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the policy name");
			String policyName = sc.nextLine();
			
			b.addPolicyDetails(policyId, policyName);
			
		}
		
		HashMap<Integer, String> policyMap = b.getMap();
		
		for(Map.Entry<Integer, String> e : policyMap.entrySet()){
			System.out.println(e.getKey()+ " "+e.getValue());
		}
		
		System.out.println("Enter the policy type to be searched");
		String type = sc.next();
		
		ArrayList<Integer> list = b.searchBasedOnPolicyType(type);
		for(int policy : list ) {
			System.out.println(policy);
		}
	}
}
