package com.Assignment_2_2;

public class Triangle implements Shape {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

}
