package org.example.spring.core.d_javaBased.u_events.a_builtInEvents;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.t_events.a_builtInEvents");
		
		Employee emp = context.getBean(Employee.class);
		emp.greet();
		
		context.close();
	}
}
