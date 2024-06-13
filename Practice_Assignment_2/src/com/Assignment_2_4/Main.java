package com.Assignment_2_4;

public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		Vehicle car = new Car();
		Vehicle bicycle = new Bicycle();
		
		System.out.println("Vehicles : ");
		vehicle.speedUp();
		
		System.out.println("Car : ");
		car.speedUp();
		
		System.out.println("Bicycle : ");
		bicycle.speedUp();

	}

}
