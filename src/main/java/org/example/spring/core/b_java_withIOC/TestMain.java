package org.example.spring.core.b_java_withIOC;


interface Vehicle {
	void move();
}
class Car implements Vehicle {
	public void move() {
		System.out.println("move car");
	}
}
class Bike implements Vehicle {
	public void move() {
		System.out.println("move bike");
	}
}


class Traveller {
	Vehicle vehicle;
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	void startJourney() {
		vehicle.move();
	}
}
