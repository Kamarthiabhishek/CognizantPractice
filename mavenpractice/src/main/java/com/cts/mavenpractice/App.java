package com.cts.mavenpractice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.models.Vehicle;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
//		BeanFactory bean = new ClassPathXmlApplicationContext("bean.xml"); For small projects
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Vehicle obj = (Vehicle)ctx.getBean("car");
		obj.drive();
	}
	
}
