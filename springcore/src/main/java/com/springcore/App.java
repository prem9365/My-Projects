package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
       ApplicationContext context=new ClassPathXmlApplicationContext("cinfig.xml");
        
       Student s = (Student) context.getBean("Student1");
       System.out.println(s);
    }
}
