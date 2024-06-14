package com.Assignment_3_5;

//5. Write a Java program to calculate sum of even numbers from an given array. the array is 'int[ ] values = {4, 6, 7, 2, 13, 9, 5};'.

public class SumOfEven {

	public static void main(String[] args) {

		int[] values = { 4, 6, 7, 2, 13, 9, 5 };

		int sum = 0;

		for (int a : values) {
			if (a % 2 == 0) {
				sum += a;
			}
		}
		System.out.println("Sum of Even Numbers from an given array : " + sum);

	}

}
