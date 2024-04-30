package shophashes;

import java.util.HashMap;

public class Product {
	
	HashMap<Integer, String > map = new HashMap<>();
	
	private String name;
	private int price;
	public HashMap<Integer, String> getMap() {
		return map;
	}
	public void setMap(HashMap<Integer, String> map) {
		this.map = map;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
