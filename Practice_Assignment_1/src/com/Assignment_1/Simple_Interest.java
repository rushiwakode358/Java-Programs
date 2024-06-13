package com.Assignment_1;

import java.util.Scanner;

//13. Write a Java program to Calculate Simple Interest for a given amount, rate of interest and time duration.

public class Simple_Interest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Principal Amount : ");
		double principal = scanner.nextDouble();

		System.out.print("Enter the Rate of Interest : ");
		double rate = scanner.nextDouble();

		System.out.print("Enter the Time Duration in Year : ");
		double time = scanner.nextDouble();

		double simpleInterest = (principal * rate * time) / 100;

		System.out.println("Simple Interest is : " + simpleInterest);

		scanner.close();

	}

}
