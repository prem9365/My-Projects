package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/constructor/constructor_config.xml");
		
		Student s = (Student) context.getBean("Student");
		
		System.out.println(s);
		System.out.println(s.emp);
		
		
		context.registerShutdownHook();
		
	   }

  }
