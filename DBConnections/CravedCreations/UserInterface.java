package CravedCreations;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class MilkShakeInfo {
private Map<String,Double> shakeOrderMap=new HashMap<String,Double>();

public Map<String, Double> getShakeOrderMap() {
	return shakeOrderMap;
}

public void setShakeOrderMap(Map<String, Double> shakeOrderMap) {
	this.shakeOrderMap = shakeOrderMap;
}

public double findTotalCostOfMilkShakeOrder() {
double a=0;
	for(Map.Entry<String, Double> entry:shakeOrderMap.entrySet()) {
		a=a+entry.getValue();
	}
	return a;
}

public List<String> filterMilkShakeOrderForGivenPriceRange(double start,double end)
{
List<String> l=new ArrayList<String>();
	for(Map.Entry<String, Double> entry:shakeOrderMap.entrySet()) {
		if(entry.getValue()>=start && entry.getValue()<=end) {
			l.add(entry.getKey());
		}
		
	}
	
	return l;
}

#MAIN
public static void main(String args[]) {
	//dont change the code
	MilkShakeInfo shakeObj = new MilkShakeInfo();

	Scanner sc = new Scanner(System.in);

	Map<String,Double> sMap = new HashMap<String,Double>();

	System.out.println("Enter the number of milkshake order to be added ");
	int n = Integer.parseInt(sc.nextLine());

	System.out.println("Enter the milkshake details (milkshake:price)");
	for(int i=0;i<n;i++) {
		String s = sc.nextLine();
		String[] strArr = s.split(":");
		sMap.put(strArr[0], Double.parseDouble(strArr[1]));
	}
	shakeObj.setShakeOrderMap(sMap);
	
	double totalCost=shakeObj.findTotalCostOfMilkShakeOrder();
	System.out.println("The total cost of the milkshake purchase is $"+totalCost);

	System.out.println("Enter the range to filter the milkshake order details");
	double start=sc.nextDouble();
	double end=sc.nextDouble();
	List<String> list=shakeObj.filterMilkShakeOrderForGivenPriceRange(start,end);
	if(list.size()>0)
	{
		System.out.println("Milkshake in the price range of $"+start+" and $"+end+" are");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}else
	{
		System.out.println("There are no milkshakes in the price range of $"+start+" and $"+end);
	}

}
}



import java.util.Scanner;

public class Main{

	public static void main(String args[])	{

		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int[] arr=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(UserMainCode.getLargestSpan(arr));

	}
}

UserMainCode

public class UserMainCode {
    
   public static int getLargestSpan(int[] arr) {
   
       int gap=0,max=0;
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   gap=j;
               }
           }
           if(gap-i>max){
               max=gap-i;
           }
       }
       return max+1;
       
   }
   
}

import java.util.*;
public class UserInterface {
	public static StatueInfo extractDetails(String statueDetails){
	String val[]=statueDetails.split(":");
		StatueInfo obj=new StatueInfo(val[0],val[1],val[2],Double.parseDouble(val[3]));
		return obj;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Statue details");
		String details=sc.nextLine();
		System.out.println("Enter the Quantity");
		int Quantity=sc.nextInt();
		StatueInfo b=extractDetails(details);
		double TotalCost=b.calculateTotalStatuePrice(Quantity);
		if(TotalCost>0 ){
			System.out.println("Statue Details");
			System.out.println("Statue Name: "+b.getStatueName());
			System.out.println("Statue Origin: "+b.getOrigin());
			System.out.println("Statue carving type: "+b.getCarvingType());
			System.out.println("Statue Price: $."+b.getPrice());
			System.out.println("Total Statue Price to be paid: $."+TotalCost);
		}
		else{
			System.out.println("Invalid Statue details"); 
		}
	}
}

package CravedCreations;

public class StatueInfo {
	private String statueName;
	private String origin;
	private String carvingType;
	private double price;


	public StatueInfo() {
		super();
	}


	public StatueInfo(String statueName, String origin, String carvingType, double price) {
		super();
		this.statueName = statueName;
		this.origin = origin;
		this.carvingType = carvingType;
		this.price = price;
	}


	public String getStatueName() {
		return statueName;
	}
	public void setStatueName(String statueName) {
		this.statueName = statueName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCarvingType() {
		return carvingType;
	}	 	  	      	 	    	      	   	  	 	
	public void setCarvingType(String carvingType) {
		this.carvingType = carvingType;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public double calculateTotalStatuePrice(int quantity){

	double TotalPrice=0;
		if(price>0 && quantity>0 && carvingType.equals("Wood Carving")){
			TotalPrice=quantity*(price+(price*0.02));
			}else if(price>0 && quantity>0 && carvingType.equals("Ceramic Figurine")){
				TotalPrice=quantity*(price+(price*0.05));
				}else if(price>0 && quantity>0 && carvingType.equals("Bronze Sculpture")){
					TotalPrice=quantity*(price+(price*0.06));
				}else if(price>0 && quantity>0 && carvingType.equals("Stone Carving")){
					TotalPrice=quantity*(price+(price*0.04));
				}else if(price>0 && quantity>0 && carvingType.equals("Wire Art Sculpture")){
					TotalPrice=quantity*(price+(price*0.03));
				}else{	 	  	      	 	    	      	   	  	 	
					TotalPrice=-1;
				}
				return TotalPrice;
			}
}


https://codeshare.io/a2001

SELECT pl.customer_id, p.policy_name,
DATE_ADD(pl.dateof_enrollment, INTERVAL ,pl.no_of_years ,YEAR) AS policy_end_date
FROM policy p JOIN POLICYENROLLMENT pl ON p.policy_id=pl.policy_id
ORDER BY pl.customer_id asc;

select 
a.customer_id, 
c.customer_name,
a.account_no,
a.account_type,
a.initial_deposit,
a.interest,
((a.interest/(100)*a.initial_deposit)) as interest_amt 
from account_info as a join 
customer_personal_info as c 
on a.customer_id = c.customer_id 
order by a.customer_id asc;