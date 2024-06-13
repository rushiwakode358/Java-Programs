package com.Assignment_1;

import java.util.Scanner;

//10. Write a Java program that takes three numbers from the user and prints the greatest number.

public class Greater_Number {
	
	public static double greaterNumber(double num1, double num2, double num3) {
		
		if(num1>=num2 && num1>=num3) {
			return num1;
		}
		else if(num2>=num1 && num2>=num3) {
			return num2;
		}
		else  {
			return num3;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the 1st Number : ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Enter the 2nd Number : ");
		double num2 = scanner.nextDouble();
		
		System.out.print("Enter the 3rd Number : ");
		double num3 = scanner.nextDouble();
		
		System.out.println("The Greater number is : "+greaterNumber(num1, num2, num3));
		
		scanner.close();

	}

}
