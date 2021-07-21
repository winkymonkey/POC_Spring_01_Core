package org.example.spring.core.d_javaBased.p_value.b_withSetter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.o_value.b_withSetter");
		
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.getName());
		
		context.close();
	}
}
