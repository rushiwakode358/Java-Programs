package com.Assignment_2_1;

//1. Write a Java program to declare a class called "Student" with a name and age attributes.Create two instances of the "Student" class, set their attributes using the constructor, and print their name and age.

public class Student {

	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Student student = new Student("Rushi", 21);

		System.out.println("Student Name : " + student.getName());
		System.out.println("Student Age : " + student.getAge());

	}

}
