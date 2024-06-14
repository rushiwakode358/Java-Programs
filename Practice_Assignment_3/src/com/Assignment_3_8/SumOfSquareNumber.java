package com.Assignment_3_8;

//8. Write a Java program to calculate sum of square of numbers divisible by 3 from an given array. the array is 'int[ ] values = {4, 6, 7, 2, 12, 9, 15};'.

public class SumOfSquareNumber {

	public static void main(String[] args) {

		int[] values = { 4, 6, 7, 2, 12, 9, 15 };

		int sum = 0;

		for (int i : values) {
			if (i % 3 == 0) {
				sum += i * i;
			}

		}

		System.out.println("Sum of Numbers at Even Index from an Array : " + sum);

	}

}
