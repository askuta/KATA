package com.java.classes;

public class C01_Classes_Mod_2 {

	private static final int PEOPLE_NUMBER = 10;

	public static void main(String[] args) {
		Person2[] people = new Person2[PEOPLE_NUMBER];
		
		// Add 10 people:
		for (int index = 0; index < people.length; index++) {
			people[index] = new Person2("James Bond 00" + index, 177 + index, 84 + index);
		}

		// Print all people:
		for (Person2 person : people) {
			System.out.println(person.toString());
		}
	}
}

class Person2 {

	String name;
	int height;
	int weight;

	public Person2(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		return name + " is " + height + " tall and " + weight + "kg.";
	}
}
