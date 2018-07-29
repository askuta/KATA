package com.java.bases;

public class E06_Asterisks {
	public static void main(String[] args) {

		int counter = 0;

		for (int i = 11; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (counter % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
				counter++;
			}

			System.out.println();

		}
	}
}
