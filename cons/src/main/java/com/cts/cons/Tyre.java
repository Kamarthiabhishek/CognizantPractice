package com.cts.cons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
public class Tyre {
	@Autowired
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Working";
	}
	
	public Tyre(String brand) {
		// TODO Auto-generated constructor stub
		this.brand = brand;
	}
}
