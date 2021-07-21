package org.example.spring.core.d_javaBased.o_lookup.b_withLookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;


@Component
@SuppressWarnings("unused")
public class Office {
	
	@Autowired
	private Employee emp;
	
	@Lookup
	public Employee getEmployee() {
		return null;
	}
}
