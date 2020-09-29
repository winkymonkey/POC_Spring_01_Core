package com.example.spring.core.d_javaBased.k_componentWithBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.j_componentWithBean");
		
		Office ofc = context.getBean(Office.class);
		Employee emp = context.getBean(Employee.class);
		
		System.out.println(ofc.getName());
		System.out.println(emp.getSalary());
		
		context.close();
	}
}
