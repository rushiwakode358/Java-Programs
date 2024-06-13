package com.Assignment_2_8;

public class Manager extends Employee {

	public Manager(String name, String address, double salary) {
		super(name, address, salary, "Manager");

	}

	@Override
	public double calculateBonus() {
		return salary * 0.25;
	}

	@Override
	public String managingProjects() {
		return name + " is Managing High Level Projects.";
	}

}
