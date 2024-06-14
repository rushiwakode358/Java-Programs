package com.Assignment_3_2;

//2. Write a Java program to calculate the average value of array elements. the array is 'int array[ ] = {55, 66, 44, 22, 55, 77}' .

public class AverageOfArray {

	public static void main(String[] args) {

		int array[] = { 55, 66, 44, 22, 55, 77 };

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}

		int average = sum / array.length;

		System.out.println("Sum of given array = " + average);

	}

}
