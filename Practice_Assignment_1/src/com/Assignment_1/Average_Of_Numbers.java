package com.Assignment_1;

import java.util.Scanner;

//4. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

public class Average_Of_Numbers {
	
	public static double average(double a , double b, double c) {
		return (a+b+c)/3;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the 1st Number : ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Enter the 2nd Number : ");
		double num2 = scanner.nextDouble();
		
		System.out.print("Enter the 3rd Number : ");
		double num3 = scanner.nextDouble();
		
		System.out.println("Average of 3 Numbers : "+average(num1, num2, num3));
		
		scanner.close();

	}

}
