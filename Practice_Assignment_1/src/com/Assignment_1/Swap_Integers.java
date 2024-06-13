package com.Assignment_1;

import java.util.Scanner;

//7. Write a Java program to swap two variables.

public class Swap_Integers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter 1st Number : ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Enter 2nd Number : ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Before Swapping the Numbers : ");
		
		System.out.println("1st Number is : "+num1);
		System.out.println("2nd Number is : "+num2);
		
		System.out.println("After Swapping the Number : ");
		
		double a = num2;
		double b = num1;
		
		System.out.println("1st Number is : "+a);
		System.out.println("2nd Number is : "+b);
		
		scanner.close();

	}

}
