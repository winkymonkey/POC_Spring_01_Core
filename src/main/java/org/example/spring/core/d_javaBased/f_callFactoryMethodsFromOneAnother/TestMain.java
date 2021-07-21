package org.example.spring.core.d_javaBased.f_callFactoryMethodsFromOneAnother;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp1 = context.getBean("e1",Employee.class);
		Employee emp2 = context.getBean("e2",Employee.class);
		
		System.out.println(emp1.getName());
		System.out.println(emp2.getName());
		
		context.close();
	}
}
