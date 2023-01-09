package com.spring.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Meetup {
	
	public static void main(String[] args) {
		
		ApplicationContext  con  = new ClassPathXmlApplicationContext("com/spring/standalone/alon.xml");
		
		Person  per = con.getBean("person",Person.class);
		
		System.out.println(per.hashCode());
		
Person  per1 = con.getBean("person",Person.class);
		
		System.out.println(per1.hashCode());
		

	/*	System.out.println(per.getFriends().getClass().getName());
		
		
		System.out.println("***********************************************");
		System.out.println(per.getFeesStructure());
		System.out.println(per.getFeesStructure().getClass().getName());
		
		
		System.out.println("=============================");
		
		System.out.println(per.getScore());
		
		*/
		
		
		System.out.println("=============================");
		Car c = con.getBean("Car", Car.class);
		System.out.println(c.hashCode());
		
		
		Car c1 = con.getBean("Car", Car.class);
		System.out.println(c1);
	}

}
