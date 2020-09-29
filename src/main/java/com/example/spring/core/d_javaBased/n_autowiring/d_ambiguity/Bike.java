package com.example.spring.core.d_javaBased.n_autowiring.d_ambiguity;

import org.springframework.stereotype.Component;


@Component
class Bike implements Vehicle {
	public void start() {
		System.out.println("Starting Bike");
	}
}
