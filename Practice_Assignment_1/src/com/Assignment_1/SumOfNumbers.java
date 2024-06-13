package com.Assignment_1;

import java.util.Scanner;

// 1. Write a Java program that takes two values as input and displays the sum of two numbers

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter 1st Number : ");
		double a = scanner.nextDouble();

		System.out.print("Enter 2nd Number : ");
		double b = scanner.nextDouble();

		double c = a + b;

		System.out.print("Sum of Two Numbers : " + c);
		
		scanner.close();

	}

}
