package org.example.spring.core.d_javaBased.r_conditional;


public class Employee {
	String type;
	
	public Employee(String type) {
		this.type = type;
	}
	
	public void greet() {
		System.out.println("Welcome, You "+type);
	}
}
