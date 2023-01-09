package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	private String name;
	@Autowired
	@Qualifier("addres")
	private Address address;
	

	public String getName() {
		System.out.println("in setter method");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("inside the  constructor`");
	}

	public Employee() {
		super();
System.out.println("Inside the");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
	

}
