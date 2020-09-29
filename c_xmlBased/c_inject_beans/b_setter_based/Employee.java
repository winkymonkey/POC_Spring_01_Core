package com.example.spring.core.c_xmlBased.c_inject_beans.b_setter_based;


public class Employee {
	private Salary sal;
	
	public Salary getSal() {
		return sal;
	}
	public void setSal(Salary sal) {
		this.sal = sal;
	}

	public void calculateSalary() {
		sal.calculate();
	}
}
