package com.example.spring.core.c_xmlBased.e_autowiring.c_byConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/spring/core/c_xmlBased/e_autowiring/c_byConstructor/Beans.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		emp.calculateSalary();
		
		context.close();
	}
}
