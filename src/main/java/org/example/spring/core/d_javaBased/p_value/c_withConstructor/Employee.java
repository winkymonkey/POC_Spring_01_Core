package org.example.spring.core.d_javaBased.p_value.c_withConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	private String name;
	
	Employee(@Value("Jack")String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
