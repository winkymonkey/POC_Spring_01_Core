package com.example.spring.core.d_javaBased.n_autowiring.d_ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Traveller {
	
	@Autowired
	@Qualifier("bike")
	private Vehicle vehicle;
	
	public void travel() {
		vehicle.start();
	}
}
