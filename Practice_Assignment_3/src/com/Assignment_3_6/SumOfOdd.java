package com.Assignment_3_6;

//6. Write a Java program to calculate sum of odd numbers from an given array. the array is 'int[ ] values = {24, 36, 47, 27, 13, 9, 5};'.

public class SumOfOdd {

	public static void main(String[] args) {
		
		int[ ] values = {24, 36, 47, 27, 13, 9, 5};
		
		int sum = 0;

		for (int a : values) {
			if (a % 2 != 0) {
				sum += a;
			}
		}
		System.out.println("Sum of Even Numbers from an given array : " + sum);

	}

}
