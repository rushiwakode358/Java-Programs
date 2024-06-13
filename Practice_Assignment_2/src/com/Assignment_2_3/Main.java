package com.Assignment_2_3;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal bird = new Bird();
		Animal cat = new Cat();

		System.out.print("Some Generic Animal Sounds : ");
		animal.sound();
		System.out.print("Bird Sounds : ");
		bird.sound();
		System.out.print("Car Sounds : ");
		cat.sound();

	}

}
