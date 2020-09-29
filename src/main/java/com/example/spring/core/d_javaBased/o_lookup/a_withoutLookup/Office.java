package com.example.spring.core.d_javaBased.o_lookup.a_withoutLookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Office {
	
	@Autowired
	private Employee emp;
	
	public Employee getEmployee() {
		return emp;
	}
}
