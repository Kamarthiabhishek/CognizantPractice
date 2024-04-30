package com.cts.spring.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.spring.models.Products;

public interface ProductRepository extends JpaRepository<Products,Integer>{
	
}
