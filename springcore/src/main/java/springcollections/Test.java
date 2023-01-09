package springcollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context	= new ClassPathXmlApplicationContext("springcollections/collectionconfig.xml");
	Employee emp=(Employee) context.getBean("emp");
	
	
	System.out.println(emp);
	System.out.println(emp.getName());
	System.out.println(emp.getAddress());
	System.out.println(emp.getCourses());
	
	
	}

}
