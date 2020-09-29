package com.example.spring.core.d_javaBased.m_scanAdditionalBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = context.getBean(Employee.class);
		emp.greet();
		Student stu = context.getBean(Student.class);
		stu.greet();
		
		context.close();
	}
}
