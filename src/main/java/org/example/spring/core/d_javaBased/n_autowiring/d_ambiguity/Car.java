package org.example.spring.core.d_javaBased.n_autowiring.d_ambiguity;

import org.springframework.stereotype.Component;


@Component
class Car implements Vehicle {
	public void start() {
		System.out.println("Starting Car");
	}
}
