package com.example.spring.core.d_javaBased.q_profile;


public class Employee {
	String type;
	
	public Employee(String type) {
		this.type = type;
	}
	
	public void greet() {
		System.out.println("Welcome "+type);
	}
}
