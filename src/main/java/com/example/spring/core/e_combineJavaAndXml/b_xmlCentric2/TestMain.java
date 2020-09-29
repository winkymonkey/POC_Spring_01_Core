package com.example.spring.core.e_combineJavaAndXml.b_xmlCentric2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/spring/core/e_combineJavaAndXml/b_xmlCentric2/Beans.xml");
		
		Employee emp = context.getBean(Employee.class);
		emp.greet();
		
		context.close();
	}
}
