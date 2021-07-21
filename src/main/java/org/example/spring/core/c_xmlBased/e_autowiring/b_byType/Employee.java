package org.example.spring.core.c_xmlBased.e_autowiring.b_byType;


public class Employee {
	private Salary mySalary;

	public Salary getMySalary() {
		return mySalary;
	}
	public void setMySalary(Salary mySalary) {
		this.mySalary = mySalary;
	}

	public void calculateSalary() {
		mySalary.getSalary();
	}
}
