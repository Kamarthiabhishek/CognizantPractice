package com.cts.cons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	@Autowired
	private Tyre tyre;
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Car"+tyre);
	}
}
