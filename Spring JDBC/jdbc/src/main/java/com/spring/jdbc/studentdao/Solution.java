package com.spring.jdbc.studentdao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.spring.jdbc.practice.Student;

public class Solution {
	public static void main(String[] args) {
		
		
		
		
		ApplicationContext con = new AnnotationConfigApplicationContext(Jdbcconfig.class);
		
		StudentImpl result = con.getBean("object",StudentImpl.class);
		
		
		
		Student1 s= new Student1();
		s.setBranch("Walkar");
		s.setId(8431);
		s.setS_name("Aalam");
		
		int r = result.insert(s);
		System.out.println("inserted sucessfully  "+r);
		
		
		
		result.delete(114);
		
		System.out.println("deleted");
		
		
	}

	
}
