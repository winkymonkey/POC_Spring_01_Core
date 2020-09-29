package com.example.spring.core.c_xmlBased.b_instantiate_beans.c_instancefactory_method;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/spring/core/c_xmlBased/b_instantiate_beans/c_instancefactory_method/Beans.xml");
		
		Animal cat = (Animal)context.getBean("cat");
		Animal dog = (Animal)context.getBean("dog");
		cat.makeSound();
		dog.makeSound();
		
		context.close();
	}
}
