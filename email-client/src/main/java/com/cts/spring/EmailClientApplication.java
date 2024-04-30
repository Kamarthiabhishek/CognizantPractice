package com.cts.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.cts.emailclient.service.BusinessService;


@EnableScheduling
@SpringBootApplication
public class EmailClientApplication {

	
	@Autowired 	
	private BusinessService bs;
	public static void main(String[] args) {
		SpringApplication.run(EmailClientApplication.class, args);
	}
	
	@Scheduled(fixedDelay = 30000)
	public void send() {
		bs.sendEmail();
	}

}
