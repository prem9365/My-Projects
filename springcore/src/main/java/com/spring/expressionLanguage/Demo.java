package com.spring.expressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("object")
public class Demo {
	@Value("#{3>6? 44:89}")
	private int x;
	
	@Value("#{T(java.lang.Math).sqrt(1455)}")
	private int y;
	
	@Value("#{8>3}")
	private boolean isActive;
	 
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", isActive=" + isActive + "]";
	}

	
	
	

}
