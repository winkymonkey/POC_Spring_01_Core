package com.example.spring.core.c_xmlBased.b_instantiate_beans.b_staticfactory_method;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/spring/core/c_xmlBased/b_instantiate_beans/b_staticfactory_method/Beans.xml");
		
		AnimalFactory animalFactory = (AnimalFactory) context.getBean("animalFactory");
		animalFactory.makeSound();
		
		context.close();
	}
}
