package com.Assignment_2_8;

//8. Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.

public class Employee {

	protected String name;
	protected String address;
	protected double salary;
	protected String jobTitle;

	public Employee(String name, String address, double salary, String jobTitle) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public double calculateBonus() {
		return salary * 0.20;
	}

	public String generatePerformanceReport() {
		return name + " ( " + jobTitle + " ) is Performance Satisfactory";
	}

	public String managingProjects() {
		return name + " is Managing General Projects";
	}

	public void printDetails() {
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Salary : " + salary);
		System.out.println("Job Title : " + jobTitle);
	}

}
