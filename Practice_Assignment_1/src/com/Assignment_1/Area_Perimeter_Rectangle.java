package com.Assignment_1;

import java.util.Scanner;

// 5. Write a Java program to print the area and perimeter of a rectangle

public class Area_Perimeter_Rectangle {
	
	public static double Area(double length, double breadth) {
		return length*breadth;
	}
	
	public static double Perimeter(double length, double breadth) {
		return 2*(length+breadth);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Length of Rctangle : ");
		double length = scanner.nextDouble();
		
		System.out.print("Enter the breadth of Rctangle : ");
		double breadth = scanner.nextDouble();
		
		System.out.println("Area of Rectangle is : "+Area(length, breadth));
		
		System.out.println("Perimeter of Rectangle is : "+Perimeter(length, breadth));
		
		scanner.close();

	}

}
