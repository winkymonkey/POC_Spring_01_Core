package org.example.spring.core.d_javaBased.n_autowiring.b_withSetter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.m_autowiring.b_withSetter");
		
		Employee emp = context.getBean(Employee.class);
		emp.announce();
		
		context.close();
	}
}
