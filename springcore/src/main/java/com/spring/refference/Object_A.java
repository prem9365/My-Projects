package com.spring.refference;

public class Object_A {
	private int x;
	private Object_B b;
	
	
	public Object_A(int x, Object_B b) {
		super();
		this.x = x;
		this.b = b;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Object_B getB() {
		return b;
	}
	public void setB(Object_B b) {
		this.b = b;
	}
	
	
	public Object_A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Object_A [x=" + x + ", b=" + b + "]";
	}

}
