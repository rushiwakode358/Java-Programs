package com.Assignment_2_5;

//5. Write a Java program to overload a add() method.

public class Overloading_Method {
	
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public double add(double a, double b, double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		
		Overloading_Method Addition = new Overloading_Method();
		
		System.out.println("Addition of Two Integers : "+Addition.add(20, 30));
		System.out.println("Addition of Two Double : "+Addition.add(25.3, 54.8));
		System.out.println("Addition of Three Integers : "+Addition.add(20, 30, 40));
		System.out.println("Addition of Three Double : "+Addition.add(40.5, 50.3, 60.25));

	}

}
