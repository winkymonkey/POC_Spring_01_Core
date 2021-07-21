package org.example.spring.core.c_xmlBased.b_instantiate_beans.a_constructor_method;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/spring/core/c_xmlBased/b_instantiate_beans/a_constructor_method/Beans.xml");
		
		Account account = (Account) context.getBean("account");
		account.print();
		
		context.close();
	}
}
