package com.example.spring.core.d_javaBased.n_autowiring.c_withConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	
	private Salary salary;
	
	@Autowired
	public Employee(Salary salary) {
		this.salary = salary;
	}
	
	public void announce() {
		System.out.println("Employee's salary="+salary.getBasicPay());
	}
}
