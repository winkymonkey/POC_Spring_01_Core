package com.example.spring.core.c_xmlBased.e_autowiring.a_byName;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/spring/core/c_xmlBased/e_autowiring/a_byName/Beans.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		emp.calculateSalary();
		
		context.close();
	}
}
