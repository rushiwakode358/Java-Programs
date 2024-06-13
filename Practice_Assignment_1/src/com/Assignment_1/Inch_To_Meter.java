package com.Assignment_1;

import java.util.Scanner;

//8. Write a Java program that reads a number in inches and converts it to meters.

public class Inch_To_Meter {
	
	public static double conversion(double inch) {
		double meter;
		meter = inch/39.37;
		return meter;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Number in Inches : ");
		double inches = scanner.nextDouble();
		
		System.out.println("After Conversion of Inches to Meter ");
		System.out.println("Number in Meter is : "+conversion(inches)+" m");
		
		scanner.close();

	}

}
