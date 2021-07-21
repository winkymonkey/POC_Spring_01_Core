package org.example.spring.core.c_xmlBased.c_inject_beans.a_constructor_based;


public class Employee {
	private Salary sal;
	
	public Employee(Salary salary) {
		this.sal = salary;
	}
	
	public void calculateSalary() {
		sal.calculate();
	}
}
