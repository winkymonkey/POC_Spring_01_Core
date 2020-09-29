package com.example.spring.core.d_javaBased.c_lateLoadConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(AppConfig.class);
		context.register(AppConfig2.class);
		context.refresh();
		
		Employee emp = context.getBean(Employee.class);
		Student stu = context.getBean(Student.class);
		emp.greet();
		stu.greet();
		
		context.close();
	}
}
