package com.Assignment_2_8;

public class Main {

	public static void main(String[] args) {

		Employee manager = new Manager("Rushi", "Pune", 954683);
		Employee developer = new Developer("Harshal", "Nandura", 901542);
		Employee programmer = new Programmer("Abhishek", "Khamgaon", 853645);

		System.out.println("Manager Details : ");
		manager.printDetails();
		System.out.println("Bonus : " + manager.calculateBonus());
		System.out.println(manager.generatePerformanceReport());
		manager.managingProjects();
		System.out.println();

		System.out.println("Developer Details : ");
		developer.printDetails();
		System.out.println("Bonus : " + developer.calculateBonus());
		System.out.println(developer.generatePerformanceReport());
		developer.managingProjects();
		System.out.println();

		System.out.println("Programmer Details : ");
		programmer.printDetails();
		System.out.println("Bonus : " + programmer.calculateBonus());
		System.out.println(programmer.generatePerformanceReport());
		programmer.managingProjects();
		System.out.println();

	}

}
