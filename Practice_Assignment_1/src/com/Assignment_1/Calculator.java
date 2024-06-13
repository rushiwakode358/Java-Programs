package com.Assignment_1;

import java.util.Scanner;

//15. Write a Java program to perform basic Calculator operations.

public class Calculator {

	public static void main(String[] args) {

		System.out.println("**** Calculator ****");
		System.out.println("_____________________");
		System.out.println("                     ");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		System.out.println("_____________________");

		Scanner sc = new Scanner(System.in);

		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();

		System.out.print("Select the Operation : ");
		int c = sc.nextInt();

		if (c == 1) {
			System.out.println("Addition = " + (a + b));
		} else if (c == 2) {
			System.out.println("Substraction = " + (a - b));
		} else if (c == 3) {
			System.out.println("Multiplication = " + (a * b));
		} else if (c == 4) {
			System.out.println("Division = " + (a / b));
		} else if (c == 5) {
			System.out.println("Modulus = " + (a % b));
		} else {
			System.out.println("Invalid Input");
		}

		sc.close();

	}

}
