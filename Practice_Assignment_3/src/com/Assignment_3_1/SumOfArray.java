package com.Assignment_3_1;

//1. Write a Java program to sum values of an given array. the array is 'int[ ] values = {34, 56, 78, 20, 78, 90, 74};'.

public class SumOfArray {

	public static void main(String[] args) {

		int[] values = { 34, 56, 78, 20, 78, 90, 74 };

		int sum = 0;

		for (int i = 0; i < values.length; i++) {

			sum += values[i];

		}
		System.out.println("Sum of given array = " + sum);

	}

}
