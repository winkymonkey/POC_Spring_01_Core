package org.example.spring.core.d_javaBased.r_conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfigMac.class, AppConfigWindows.class);
		context.refresh();
		
		Employee emp = context.getBean(Employee.class);
		emp.greet();
		
		context.close();
	}
}


