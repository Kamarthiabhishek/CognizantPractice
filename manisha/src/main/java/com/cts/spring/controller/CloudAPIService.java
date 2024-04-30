package com.cts.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.spring.models.CloudVendor;

@RestController

public class CloudAPIService {

	@RequestMapping("/cloudvender")
	public String welcome() {
		return "Index.html";
	}
	
	@GetMapping("{vendorId}")
	public CloudVendor getVendorDetails(String vendorId) {
		return new CloudVendor("C1", "Abhishek", "Chennai", "777777777");
	}
}
