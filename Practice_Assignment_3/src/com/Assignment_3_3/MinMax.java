package com.Assignment_3_3;

import java.util.Arrays;

//3. Write a Java program to find the maximum and minimum value from a given an array. array is 'int array[ ] = {45, 67, 98, 63, 59, 24, 48}' .

public class MinMax {

	public static void main(String[] args) {

		int array[] = { 45, 67, 98, 63, 59, 24, 48 };

		Arrays.sort(array);
		System.out.println("Minimum Value of Array is : " + array[0]);
		System.out.println("Maximum Value of Array is : " + array[array.length - 1]);

	}

}
