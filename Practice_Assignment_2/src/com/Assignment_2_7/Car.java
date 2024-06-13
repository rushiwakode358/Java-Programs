package com.Assignment_2_7;

public class Car extends Vehicle {

	@Override
	public void drive() {
		System.out.println("Repairing a Car");
	}

	public static void main(String[] args) {

		Vehicle car = new Car();
		car.drive();

	}

}
