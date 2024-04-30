package com.cts.beans;

public class Orders {
	private int OrderId, Qunatity, ProductId, CustomerId;

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getQunatity() {
		return Qunatity;
	}

	public Orders(int orderId, int qunatity, int productId, int customerId) {
		super();
		OrderId = orderId;
		Qunatity = qunatity;
		ProductId = productId;
		CustomerId = customerId;
	}

	public void setQunatity(int qunatity) {
		Qunatity = qunatity;
	}

	
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
}
