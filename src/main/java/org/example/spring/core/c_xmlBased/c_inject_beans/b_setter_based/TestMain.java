package org.example.spring.core.c_xmlBased.c_inject_beans.b_setter_based;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/spring/core/c_xmlBased/c_inject_beans/b_setter_based/Beans.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		emp.calculateSalary();
		
		context.close();
	}
}
