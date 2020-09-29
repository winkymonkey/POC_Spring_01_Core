package com.example.spring.core.d_javaBased.b_multipleConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
		
		Employee emp = context.getBean(Employee.class);
		Student stu = context.getBean(Student.class);
		emp.greet();
		stu.greet();
		
		context.close();
	}
}

