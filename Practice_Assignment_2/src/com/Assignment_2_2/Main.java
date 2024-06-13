package com.Assignment_2_2;

public class Main {

	public static void main(String[] args) {

		Shape rectangle = new Rectangle(10, 20);
		Shape circle = new Circle(10);
		Shape triangle = new Triangle(10, 20);

		System.out.println("Area of Rectangle : " + rectangle.getArea());
		System.out.println("Area of Circle : " + circle.getArea());
		System.out.println("Area of Triangle : " + triangle.getArea());

	}

}
