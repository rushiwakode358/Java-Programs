package com.Assignment_1;

import java.util.Scanner;

//6. Write a Java program to print the area of a triangle

public class Area_Of_Triangle {

	public static double Area(double height, double base) {
		return (height * base) / 2;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Height of Triangle (cm) : ");
		double height = scanner.nextDouble();

		System.out.print("Enter the Base of Triangle (cm) : ");
		double base = scanner.nextDouble();

		System.out.println("Area of Triangle is : " + Area(height, base)+" cm");

		scanner.close();

	}

}
