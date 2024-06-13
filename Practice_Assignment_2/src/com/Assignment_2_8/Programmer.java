package com.Assignment_2_8;

public class Programmer extends Employee {

	public Programmer(String name, String address, double salary) {
		super(name, address, salary, "Programmer");

	}

	@Override
	public double calculateBonus() {
		return salary * 0.10;
	}

	@Override
	public String managingProjects() {
		return name + " is Managing Coding tasks and Assignments.";
	}

}
