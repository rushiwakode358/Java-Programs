package com.Assignment_1;

import java.util.Scanner;

//3. Write a Java program to print the area and perimeter of a circle.

public class Perimeter_Of_Circle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Choose the Radius or Diameter for finding the Perimeter (radius/diameter) : ");
		String condition = scanner.nextLine();
		
		if(condition.equalsIgnoreCase("radius")) {
			System.out.print("Enter the Radius of Circle : ");
			double radius = scanner.nextDouble();
			
			double perimeter = 2*Math.PI*radius;
			System.out.println("Perimeter of a Circle : "+perimeter);
		}
		else if(condition.equalsIgnoreCase("diameter")) {
			System.out.print("Enter the Diameter of Circle : ");
			double diameter = scanner.nextDouble();
			
			double perimeter = diameter*Math.PI;
			System.out.println("Perimeter of a Circle : "+perimeter);
		}
		else {
			System.out.println("Invalid Input");
		}
		scanner.close();
		
			
		

	}

}
