package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class App 
{
    public static void main( String[] args )
    { 
      ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
         JdbcTemplate tem = con.getBean("jdbcTemplate",JdbcTemplate.class);
         
         String q= "insert into Student(id,S_name,Branch) values(?,?,?)";
         
         int result = tem.update(q,123,"prem","mechanical");
         
         System.out.println("inserted succefully"+ result);
         
         
        
    }
}
