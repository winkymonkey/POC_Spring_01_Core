package com.example.spring.core.d_javaBased.n_autowiring.a_withProperty;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.m_autowiring.a_withProperty");
		
		Employee emp = context.getBean(Employee.class);
		emp.announce();
		
		context.close();
	}
}
