package com.example.spring.core.c_xmlBased.b_instantiate_beans.c_instancefactory_method;


public interface Animal {
	void makeSound();
}

class Cat implements Animal {
	public void makeSound() {
		System.out.println("Making Cat sound");
	}
}

class Dog implements Animal {
	public void makeSound() {
		System.out.println("Making Dog sound");
	}
}
