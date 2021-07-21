package org.example.spring.core.c_xmlBased.e_autowiring.b_byType;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/spring/core/c_xmlBased/e_autowiring/b_byType/Beans.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		emp.calculateSalary();
		
		context.close();
	}
}
