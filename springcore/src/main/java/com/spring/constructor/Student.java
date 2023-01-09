package com.spring.constructor;

import java.util.List;

public class Student {
	
	private String name;
	
	private int id;
	 
	Employee emp;
	
	private List<String> list;
	
	
	Student(String name, int id,Employee emp,List<String> list){
		
		
		System.out.println("setting properties");
		this.name=name;
		this.id = id;
		this.emp =emp;
		this.list=list;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", emp=" + emp + ", list=" + list + "]";
	}
	
	public void init(){
		
		System.out.println("inside the init method");
	}
	
   public void destroy(){
	
	  System.out.println("inside the destroy method");
	
}


}
