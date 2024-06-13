package com.Assignment_2_2;

public class Rectangle implements Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
