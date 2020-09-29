package com.example.spring.core.d_javaBased.q_profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.getEnvironment().setActiveProfiles("UAT");
		context.register(AppConfigDEV.class, AppConfigUAT.class);
		context.refresh();
		
		Employee emp = context.getBean(Employee.class);
		emp.greet();
		
		context.close();
	}
}
