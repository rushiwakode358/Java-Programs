package com.Assignment_2_4;

public class Bicycle extends Vehicle {

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("Car speeds up: " + speed + " km/hr");
	}

}
