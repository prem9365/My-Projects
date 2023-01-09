package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Solution {

	public static void main(String[] args) {

		ApplicationContext contex = new AnnotationConfigApplicationContext(Javaconfig.class);
		
		Store s =(Store) contex.getBean("getStore");
		System.out.println(s);
		
		s.fruite();
	}

}
