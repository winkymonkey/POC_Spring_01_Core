package org.example.spring.core.d_javaBased.o_lookup.a_withoutLookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Employee {
	
	private int id = (int)(Math.random()*1000);
	
	public int getId() {
		return id;
	}
}
