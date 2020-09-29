package com.example.spring.core.e_combineJavaAndXml.a_xmlCentric1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/spring/core/e_combineJavaAndXml/a_xmlCentric1/Beans.xml");
		
		Employee emp = context.getBean(Employee.class);
		emp.greet();
		
		context.close();
	}
}
