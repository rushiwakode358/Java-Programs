package com.Assignment_1;

import java.util.Scanner;

//16. Write a simple Java program to calculate a Factorial of a number.

public class Factorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int fact = 1;

		System.out.print("Enter the Number : ");
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial of " + number + " is : " + fact);

		scanner.close();

	}

}
