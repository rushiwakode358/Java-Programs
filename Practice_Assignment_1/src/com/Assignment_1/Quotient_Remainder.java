package com.Assignment_1;

import java.util.Scanner;

//14. Write a Java program to Find Quotient and Remainder for a given number.

public class Quotient_Remainder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Dividend : ");
		int dividend = scanner.nextInt();

		System.out.print("Enter the Divisor : ");
		int divisor = scanner.nextInt();

		int quotient = dividend / divisor;

		int remainder = dividend % divisor;

		System.out.println("The Quotient is : " + quotient);
		System.out.println("The Remainder is : " + remainder);

		scanner.close();

	}

}
