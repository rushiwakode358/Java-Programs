package com.Assignment_3_7;

//7. Write a Java program to calculate sum of numbers at even index from an given array. the array is 'int[ ] values = {4, 6, 7, 2, 13, 9, 5};'.

public class SumOfEvenIndex {

	public static void main(String[] args) {

		int[] values = { 4, 6, 7, 2, 13, 9, 5 };

		int sum = 0;

		for (int i = 0; i < values.length; i += 2) {
			sum += values[i];
		}

		System.out.println("Sum of Numbers at Even Index from an Array : " + sum);

	}

}
