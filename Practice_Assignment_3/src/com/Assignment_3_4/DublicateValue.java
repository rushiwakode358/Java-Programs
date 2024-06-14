package com.Assignment_3_4;

import java.util.LinkedHashMap;
import java.util.Map;

//4. Write a Java program to find duplicate values in an array values, the array is 'int values[ ] = {23, 45, 23, 56, 88, 99, 55, 34, 45, 67, 11, 88, 99, 11, 34}' 

public class DublicateValue {

	public static void main(String[] args) {
		
		int values[ ] = {23, 45, 23, 56, 88, 99, 55, 34, 45, 67, 11, 88, 99, 11, 34};
		
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();

		for (Integer I : values) {
			if (hm.containsKey(I)) {
				hm.put(I, hm.get(I) + 1);
			} else {
				hm.put(I, 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : hm.entrySet()) {

			if (e.getValue() >= 2)

			{
				System.out.print(e.getKey()+", ");
			}
		}

	}

}
