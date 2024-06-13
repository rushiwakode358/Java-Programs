package com.Assignment_1;

import java.util.Scanner;

//11. Write a Java program to find the number of days in a month.

public class Days_In_Month {
	
	public static int Month(String month) {
		
		if(month.equalsIgnoreCase("February")) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Year : ");
			int year = sc.nextInt();
			sc.close();
			if(year%4==0) {
				return 29;
			}
			else {
				return 28;
			}
			
		}
		else if(month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November")) {
			return 30;
		}
		else if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("December")) {
			return 31;
		}
		else {
			int i=Integer.parseInt("Enter Valid Month"); 
			return i;
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter The Month : ");
		String month = scanner.nextLine();
		
		System.out.println("Days in the Month "+month+" is : "+Month(month));
		
		scanner.close();

	}

}
