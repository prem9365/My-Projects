package com.spring.jdbc.studentdao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
//@ComponentScan(basePackages="com.spring.jdbc.studentdao")
public class Jdbcconfig {
	
	@Bean
	public DriverManagerDataSource getDtataSource(){
		
		DriverManagerDataSource d = new  DriverManagerDataSource ();
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/SpringJdbc");
		d.setUsername("root");
		d.setPassword("Prem1618");
		return d;
		
		
	}
	
	@Bean("JdbcTemplate")
	public JdbcTemplate jdbcTemplate(){
		JdbcTemplate jt =new JdbcTemplate(getDtataSource());
		
		return jt;
	}
	
	@Bean("object") 
	
	 public  StudentImpl getStudentImpl(){
		 StudentImpl student = new StudentImpl();
				 student.setJdbcTemplate(jdbcTemplate());
		 
	return student;
		 
	 }

	
	
	
	
}
