package com.cts.cons;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bike Driving");
	}
}
