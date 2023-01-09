package com.spring.refference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class Sloution {

	public static void main(String[] args) {
		
    ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/refference/reff_config.xml");
    
    Object_A object= (Object_A) context.getBean("Aref");    
    
    System.out.println(object);
    
    System.out.println(" Object A  :"+object.getX());
    System.out.println( "  Objrct B  :"+object.getB().getY());
    
    
    
	}

}
