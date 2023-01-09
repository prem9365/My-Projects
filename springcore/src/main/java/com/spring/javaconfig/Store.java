package com.spring.javaconfig;

import org.springframework.stereotype.Component;

//@Component("store")
public class Store {
	
	
	private Mango mango;
	
	
public Store(Mango mango) {
		super();
		this.mango = mango;
	}

public Mango getMango() {
		return mango;
	}

	public void setMango(Mango mango) {
		this.mango = mango;
	}

void fruite(){
	
	System.out.println("Fruites are available");
	
	this.mango.getMango();
}
}
