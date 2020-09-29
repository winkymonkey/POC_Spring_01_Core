package com.example.spring.core.d_javaBased.e_duplicateFactoryMethod.giveUniqueName;


public class Employee {
	String type;
	
	public Employee(String type) {
		this.type = type;
		System.out.println(type+" employee constructed");
	}
	
	public void greet() {
		System.out.println("Welcome "+type+" employee");
	}
}
