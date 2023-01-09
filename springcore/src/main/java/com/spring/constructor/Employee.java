package com.spring.constructor;

public class Employee {
  
	private String name;
	
	private  int salary;
	
	
	Employee(String name, int salary){
		this.name=name;
		this.salary =salary;
	
	}
	
	public String toString(){
		return "Salary  :  "+salary + "  Name  : "+name;
	}
	
}
