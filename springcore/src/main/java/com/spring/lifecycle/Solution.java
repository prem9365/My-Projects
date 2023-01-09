package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/vegconfig.xml"); 
		
	Vegetable ve	= (Vegetable) context.getBean("veg");
	System.out.println(ve);
	
	  context.registerShutdownHook();
		
	}

}
