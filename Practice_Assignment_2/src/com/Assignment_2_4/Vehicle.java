package com.Assignment_2_4;

//4. Write a Java program to create a class Vehicle with a method called speedUp(). Create two sub classes Car and Bicycle Override the speedUp() method in each subclass to increase the vehicle's speed differently.

public class Vehicle {

	protected int speed;

	public Vehicle() {

		this.speed = 0;
	}

	public void speedUp() {

		speed += 20;
		System.out.println("Vehicle Speed Up " + speed + " km/hr");

	}

	public int getSpeed() {
		return speed;
	}

}
