package com.spring.standalone;

import org.springframework.beans.factory.annotation.Value;

public class Car {
	@Value("suzuki")
	private String brand;
	
	private int price;
	
	
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	

}
