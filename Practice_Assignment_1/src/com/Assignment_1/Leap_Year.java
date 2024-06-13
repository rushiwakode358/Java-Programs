package com.Assignment_1;

import java.util.Scanner;

//12. Write a Java program that takes a year from the user and prints whether it is a leap year or not.

public class Leap_Year {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Year : ");
		int year = scanner.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is the Leap Year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}

		scanner.close();

	}

}
