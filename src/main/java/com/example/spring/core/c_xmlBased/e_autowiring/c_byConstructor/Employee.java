package com.example.spring.core.c_xmlBased.e_autowiring.c_byConstructor;


public class Employee {
	private Salary mySalary;

	Employee(Salary salary) {
		this.mySalary = salary;
	}

	public void calculateSalary() {
		mySalary.getSalary();
	}
}
