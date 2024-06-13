package com.Assignment_2_4;

public class Car extends Vehicle {

	@Override
	public void speedUp() {
		speed += 30;
		System.out.println("Car Speeds up: " + speed + " km/hr");
	}

}
