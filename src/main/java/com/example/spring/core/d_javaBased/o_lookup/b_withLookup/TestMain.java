package com.example.spring.core.d_javaBased.o_lookup.b_withLookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.n_lookup.d_withLookup");
		
		Office ofc1 = context.getBean(Office.class);
		Office ofc2 = context.getBean(Office.class);
		
		System.out.println("employee-1 id="+ofc1.getEmployee().getId());
		System.out.println("employee-2 id="+ofc2.getEmployee().getId());
		
		context.close();
	}
}
