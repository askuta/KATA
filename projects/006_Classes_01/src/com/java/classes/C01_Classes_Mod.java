package com.java.classes;

public class C01_Classes_Mod {

	private static final int PEOPLE_NUMBER = 10;

	public static void main(String[] args) {
		Person1[] people = new Person1[PEOPLE_NUMBER];
		
		// Add 10 people:
		for (int index = 0; index < people.length; index++) {
			people[index] = new Person1();
			people[index].name = "James Bond 00";
			people[index].height = 177 + index;
			people[index].weight = 84 + index;
		}

		// Print all people:
		for (int index = 0; index < people.length; index++) {
			System.out.println(people[index].name + " is " + people[index].height + " tall and " + people[index].weight + "kg.");
		}
	}
}

class Person1 {

	String name;
	int height;
	int weight;

}
