package com.spring.jdbc.practice;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.studentdao.StudentDao;
import com.spring.jdbc.studentdao.StudentImpl;

/*
           Hello world.....!                                                                                            
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World.....!" );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/practice/jdbcconfig.xml");
         
   /*     JdbcTemplate tem  = con.getBean("jdbcTemplate",JdbcTemplate.class);
        
        String q="insert into Student(id,S_name,Branch) value (?,?,?)";
        
        int result = tem.update(q,201,"San2a20.vi","IT");
        
        System.out.println("Data Inserted Successfully.....!  "+ result);
        
       */
        
//        StudentDao studentDao = con.getBean("StudentDao",StudentDao.class);
//        
//        Student s = new Student();
//        
//        s.setId(90);
//        s.setS_name("vita");
//        s.setBranch("maths");
//        
//        studentDao.insert(s);
        // System.out.println("inserted successfully");
        
        
   StudentImpl res = con.getBean("StudentDao",StudentImpl.class);
      
       Student s = new Student();
       
        s.setId(143);
        s.setS_name("premmm");
        s.setBranch("Biology");
        
     //res.change(s);
       System.out.println("Data changed successfully");
      
   
   res.delete(113);
   System.out.println("successfully deleted");
   
    }
}
