package com.java.conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E04_Conditions {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Mondj egy számot 1-10-ig!");

		int yourNumber;
		yourNumber = Integer.parseInt(reader.readLine());

		switch (yourNumber) {
		case 1: {
			System.out.println("egy");
			break;
		}
		case 2: {
			System.out.println("kettő");
			break;
		}
		case 3: {
			System.out.println("három");
			break;
		}
		case 4: {
			System.out.println("négy");
			break;
		}
		case 5: {
			System.out.println("öt");
			break;
		}
		case 6: {
			System.out.println("hat");
			break;
		}
		case 7: {
			System.out.println("hét");
			break;
		}
		case 8: {
			System.out.println("nyolc");
			break;
		}
		case 9: {
			System.out.println("kilenc");
			break;
		}
		case 10: {
			System.out.println("tíz");
			break;
		}
		default: {
			System.out.println("Ejnye-bejnye. Nem ez volt a feladat..");
		}
		}
	}
}
