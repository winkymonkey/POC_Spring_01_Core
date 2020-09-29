package com.example.spring.core.d_javaBased.n_autowiring.a_withProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	
	@Autowired
	private Salary salary;
	
	public void announce() {
		System.out.println("Employee's salary="+salary.getBasicPay());
	}
}
