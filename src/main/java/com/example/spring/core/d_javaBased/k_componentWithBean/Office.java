package com.example.spring.core.d_javaBased.k_componentWithBean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class Office {
	private String name = "MyCompany";

	public String getName() {
		return name;
	}
	
	@Bean
	public Employee empInstance() {
		return new Employee(10000);
	}
}
