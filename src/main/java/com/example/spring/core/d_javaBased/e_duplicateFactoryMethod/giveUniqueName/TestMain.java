package com.example.spring.core.d_javaBased.e_duplicateFactoryMethod.giveUniqueName;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = context.getBean("e1", Employee.class);
		emp.greet();
		Employee emp2 = context.getBean("e2", Employee.class);
		emp2.greet();
		
		context.close();
	}
}
