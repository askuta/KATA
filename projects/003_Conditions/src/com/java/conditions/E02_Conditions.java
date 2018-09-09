package com.java.conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E02_Conditions {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Mondj egy számot 1-10-ig!");

		int yourNumber;
		yourNumber = Integer.parseInt(reader.readLine());

		if (yourNumber == 1) {
			System.out.println("egy");
		} else if (yourNumber == 2) {
			System.out.println("kettő");
		} else if (yourNumber == 3) {
			System.out.println("három");
		} else if (yourNumber == 4) {
			System.out.println("négy");
		} else if (yourNumber == 5) {
			System.out.println("öt");
		} else if (yourNumber == 6) {
			System.out.println("hat");
		} else if (yourNumber == 7) {
			System.out.println("hét");
		} else if (yourNumber == 8) {
			System.out.println("nyolc");
		} else if (yourNumber == 9) {
			System.out.println("kilenc");
		} else if (yourNumber == 10) {
			System.out.println("tíz");
		} else {
			System.out.println("Ejnye-bejnye. Nem ez volt a feladat..");
		}
	}
}
