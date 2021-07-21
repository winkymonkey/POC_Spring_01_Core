package org.example.spring.core.d_javaBased.h_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.g_lifecycle");
		
		context.getBean(Employee.class);
		
		context.close();
	}
}
