package com.example.spring.core.c_xmlBased.e_autowiring.a_byName;


public class Employee {
	private Salary sal;

	public Salary getSal() {
		return sal;
	}
	public void setSal(Salary sal) {
		this.sal = sal;
	}

	public void calculateSalary() {
		sal.getSalary();
	}
}
