package org.example.spring.core.e_combineJavaAndXml.c_annotationCentric;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = context.getBean(Employee.class);
		emp.greet();
		
		context.close();
	}
}
