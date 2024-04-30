package com.cts.spring.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Products {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCatregory() {
		return catregory;
	}
	public void setCatregory(String catregory) {
		this.catregory = catregory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getImageFile() {
		return imageFile;
	}
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	private String name;
	private String brand;
	private String catregory;
	private double price;
	
	@Column(columnDefinition ="TEXT")
	private String description;
	private Date createdAt;
	private String imageFile;
}
