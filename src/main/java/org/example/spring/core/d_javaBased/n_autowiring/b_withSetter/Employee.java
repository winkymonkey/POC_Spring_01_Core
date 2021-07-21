package org.example.spring.core.d_javaBased.n_autowiring.b_withSetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	
	private Salary salary;
	
	@Autowired
	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public void announce() {
		System.out.println("Employee's salary="+salary.getBasicPay());
	}
}
