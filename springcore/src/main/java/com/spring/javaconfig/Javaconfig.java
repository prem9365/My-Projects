package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan(basePackages="com.spring.javaconfig")
public class Javaconfig {
	
	@Bean
	public Mango getObject(){
		
		Mango mango=new Mango();
		
		return mango;
	
	}
	
	@Bean
	
public Store getStore(){
	return new Store(getObject());
	
	
}
}
