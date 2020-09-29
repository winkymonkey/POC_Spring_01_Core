package com.example.spring.core.c_xmlBased.b_instantiate_beans.c_instancefactory_method;


public class AnimalFactory {
	
	public Animal getCat() {		// instance factory method
		return new Cat();
	}
	public Animal getDog() {		// instance factory method
		return new Dog();
	}
}
