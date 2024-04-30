package InsuranceBazar;
import java.util.*;
public class Baazar {
	HashMap<Integer, String> map = new HashMap<>();
	
	
	public HashMap<Integer, String> getMap() {
		return map;
	}
	public void setMap(HashMap<Integer, String> map) {
		this.map = map;
	}
	
	public void addPolicyDetails(int policyNumber , String policyName) {
		map.put(policyNumber, policyName);
	}
	
	public ArrayList<Integer> searchBasedOnPolicyType(String value) {
		ArrayList<Integer> array  = new ArrayList<>();
		
		for(int policyId : map.keySet()) {
			if(map.get(policyId).contains(value)) {
				array.add(policyId);
			}
		}
		
		return array;
	}
	
	
}
