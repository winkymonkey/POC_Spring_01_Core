package com.example.spring.core.c_xmlBased.b_instantiate_beans.b_staticfactory_method;


public class AnimalFactory {
	private static final AnimalFactory animalFactory = new AnimalFactory();
	private AnimalFactory() {}
	
	public static AnimalFactory getInstance() {
		System.out.println("Static Factory method");
		return animalFactory;
	}
	
	public void makeSound() {
		System.out.println("Making Sound");
	}
}
