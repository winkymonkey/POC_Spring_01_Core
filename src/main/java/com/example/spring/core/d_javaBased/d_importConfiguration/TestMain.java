package com.example.spring.core.d_javaBased.d_importConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = context.getBean(Employee.class);
		Student stu = context.getBean(Student.class);
		emp.greet();
		stu.greet();
		
		context.close();
	}
}
