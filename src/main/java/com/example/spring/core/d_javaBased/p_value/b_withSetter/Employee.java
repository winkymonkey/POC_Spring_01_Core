package com.example.spring.core.d_javaBased.p_value.b_withSetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	private String name;
	
	@Autowired
	public void setName(@Value("Tom")String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
