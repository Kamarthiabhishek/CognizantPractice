package com.cts.Geek4geek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class City {
	private State s;
	private String name;
	private int id;

	public State getS() {
		return s;
	}

	@Autowired
	public void setS(State s) {
		this.s = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void showCityName() {
		System.out.println("CITY ID : " + id);
		System.out.println("CITY NAME : " + name);
		System.out.println("STATE : " + s.getName());
	}

}
