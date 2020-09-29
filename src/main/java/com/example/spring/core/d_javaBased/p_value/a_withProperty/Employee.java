package com.example.spring.core.d_javaBased.p_value.a_withProperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	
	@Value("Tom")
	private String name;
	
	public String getName() {
		return name;
	}
}
