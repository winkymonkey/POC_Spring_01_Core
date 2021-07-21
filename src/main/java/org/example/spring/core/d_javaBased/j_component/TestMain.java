package org.example.spring.core.d_javaBased.j_component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.i_using_Component");
		
		Employee emp = context.getBean(Employee.class);
		emp.greet();
		
		context.close();
	}
}
