package com.Assignment_1;

import java.util.Scanner;

//2. Write a Java program that takes a number as input and prints its multiplication table up to 10.

public class Table {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		int a = scanner.nextInt();

		System.out.println("Table of " + a + " is : ");

		for (int i = 1; i <= 10; i++) {
			int b = a * i;
			System.out.println(b);
		}
		
		scanner.close();

	}

}
