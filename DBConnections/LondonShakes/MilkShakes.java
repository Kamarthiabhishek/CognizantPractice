package LondonShakes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class MilkShakes {
	private HashMap<String, Double> shakeOrdser = new HashMap<>();  
	
	
	public HashMap<String, Double> getShakeOrdser() {
		return shakeOrdser;
	}
	public void setShakeOrdser(HashMap<String, Double> shakeOrdser) {
		this.shakeOrdser = shakeOrdser;
	}
	
	public double findTotalCost() {
		double a =0;
		for(Map.Entry<String, Double> entry : shakeOrdser.entrySet()) {
			a = a+ entry.getValue();
		}
		
		return a;
	}
	
	public List<String> filterMilkshake(double start, double end){
		ArrayList<String> l = new ArrayList<>();
		for(Map.Entry<String, Double> entry : shakeOrdser.entrySet()){
			if(entry.getValue() >= start && entry.getValue() <= end) {
				l.add(entry.getKey());
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		MilkShakes m = new MilkShakes();
		Scanner sc = new Scanner(System.in);
		HashMap<String , Double> map = new HashMap<>();
		System.out.println("Enter the number of milkshake order to be added ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the milkshake details (milkshaek:price)");
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] strArr = s.split(":");
			map.put(strArr[0], Double.parseDouble(strArr[1]));
		}
		m.setShakeOrdser(map);
		
		double totalCost = m.findTotalCost();
		System.out.println("The total cost of the milkshake purchase is $"+totalCost);
		
		System.out.println("Enter the range to filter the milkshake order details");
		double start = sc.nextDouble();
		double end = sc.nextDouble();
		List<String> list = m.filterMilkshake(start, end);
		if(list.size() > 0) {
			System.out.println("Milkshake in the price range of $"+start+" and $"+end+ " are");
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}else {
			System.out.println("There are no milkshakes in the price range of $"+start+" and $"+end);
		}
	}
}
