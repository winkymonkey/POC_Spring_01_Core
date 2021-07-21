package org.example.spring.core.a_java_withoutIOC;


class Car {
	void move() {
		System.out.println("move car");
	}
}

class Traveller {
	Car car = new Car();
	void startJourney() {
		car.move();
	}
}
