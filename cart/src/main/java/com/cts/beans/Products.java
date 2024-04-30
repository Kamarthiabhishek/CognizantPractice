package com.cts.beans;

public class Products {
	private int ProductId, price , qty;
	private String ProductName;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public Products(int productId, int price, int qty, String productName) {
		super();
		ProductId = productId;
		this.price = price;
		this.qty = qty;
		ProductName = productName;
	}
	
	public Products() {
		// TODO Auto-generated constructor stub
	}
	
}
