package com.Assignment_2_6;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;

	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;

	}

	public static void main(String[] args) {

		Shape circle = new Circle(10);

		System.out.println("Perimeter of Circle : " + circle.getPerimeter());
		System.out.println("Area of Circle : " + circle.getArea());

	}

}
