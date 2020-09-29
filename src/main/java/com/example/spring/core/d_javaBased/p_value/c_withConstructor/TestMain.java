package com.example.spring.core.d_javaBased.p_value.c_withConstructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.o_value.c_withConstructor");
		
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.getName());
		
		context.close();
	}
}
