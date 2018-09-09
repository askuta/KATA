package com.java.classes;

public class C01_Classes {

	private static final int PEOPLE_NUMBER = 10;
	
	public static void main(String[] args) {
		
		String[] names = new String [PEOPLE_NUMBER];
		int[] heights = new int [PEOPLE_NUMBER];
		int[] weights = new int [PEOPLE_NUMBER];
		
		// Add 10 people:
		for (int index = 0; index < PEOPLE_NUMBER; index++) {
			names[index] = "James Bond 00" + index;
			heights[index] = 177 + index;
			weights[index] = 84 + index;
		}

		// Print the 5th person:
		System.out.println("The 5th person is " + names[4] + ", who is " + heights[4] + " tall and " + weights[4] + "kg.");
	}
}
