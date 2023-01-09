package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Vegetable implements InitializingBean, DisposableBean {
	private String name;
	
	private double price;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Vegetable(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vegetable [name=" + name + ", price=" + price + "]";
	}
    
	public Vegetable() {
		super();
		
	}

	public void afterPropertiesSet() throws Exception {
		 System.out.println("inside the init method.....");
		
	}

	public void destroy() throws Exception {
         System.out.println("inside the destroy  method.....");		
	}
	
  @PostConstruct
	
	public void start(){
		System.out.println("init method");
	}
	
	@PreDestroy
	public void end(){
		System.out.println("destroy mrthod");
	}
	
	
	
	
	

    }
