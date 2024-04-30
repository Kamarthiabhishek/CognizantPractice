package com.cts.Geek4geek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		City c = ctx.getBean("city", City.class);
		c.setId(123);
		c.setName("Ballari");
		State s = ctx.getBean("state", State.class);
		s.setName("Karnataka");
		c.setS(s);
		c.showCityName();
	}
}
