package com.Assignment_2_8;

public class Developer extends Employee {

	public Developer(String name, String address, double salary) {
		super(name, address, salary, "Developer");

	}

	@Override
	public double calculateBonus() {
		return salary * 0.15;
	}

	@Override
	public String managingProjects() {
		return name + " is Managing Web Development Projects.";
	}

}
