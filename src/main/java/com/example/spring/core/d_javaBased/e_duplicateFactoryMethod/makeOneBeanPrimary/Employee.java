package com.example.spring.core.d_javaBased.e_duplicateFactoryMethod.makeOneBeanPrimary;


public class Employee {
	String type;
	
	public Employee(String type) {
		this.type = type;
		System.out.println(type+" employee!!");
	}
	
	public void greet() {
		System.out.println("Welcome "+type+" employee");
	}
}
