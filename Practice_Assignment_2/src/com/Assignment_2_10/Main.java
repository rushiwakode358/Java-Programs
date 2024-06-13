package com.Assignment_2_10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person athlete = new Athlete();

		System.out.println("Athlete : ");
		athlete.eat();
		athlete.exercise();

		Person lazyPerson = new LazyPerson();

		System.out.println("Lazy Person : ");
		lazyPerson.eat();
		lazyPerson.exercise();

	}

}
