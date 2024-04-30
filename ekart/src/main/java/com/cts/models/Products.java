package com.cts.models;

public class Products {
	private static String ProdName, ProdDesciption;
	private static int quantity, price, ProdId;

	public static int getProdId() {
		return ProdId;
	}

	public static void setProdId(int prodId) {
		ProdId = prodId;
	}

	public static String getProdName() {
		return ProdName;
	}

	public static void setProdName(String prodName) {
		ProdName = prodName;
	}

	public static String getProdDesciption() {
		return ProdDesciption;
	}

	public static void setProdDesciption(String prodDesciption) {
		ProdDesciption = prodDesciption;
	}

	public static int getQuantity() {
		return quantity;
	}

	public static void setQuantity(int quantity) {
		Products.quantity = quantity;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Products.price = price;
	}

	public Products(int prodId, String ProdName, String ProdDesciption, int qty, int price) {
		// TODO Auto-generated constructor stub
		this.ProdId = prodId;
		this.ProdName = ProdName;
		this.ProdDesciption = ProdDesciption;
		this.quantity = qty;
		this.price = price;
	}

	public Products() {
		// TODO Auto-generated constructor stub
	}

}
