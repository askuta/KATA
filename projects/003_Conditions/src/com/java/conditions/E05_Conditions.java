package com.java.conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E05_Conditions {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Mondj egy számot 1-99-ig!");

		int yourNumber;
		yourNumber = Integer.parseInt(reader.readLine());

		if (yourNumber > 99 || yourNumber < 1) {
			System.out.println("Rossz szám.");
			System.exit(1);
		}

		int ones = yourNumber % 10;
		int tens = yourNumber / 10;

		if (tens == 0) {
			System.out.println(calculateOnes(ones));
		} else {
			System.out.println(calculateTens(tens,ones) + calculateOnes(ones).toLowerCase());
		}
	}

	private static String calculateOnes(int ones) {
		switch (ones) {
		case 1: {
			return "Egy"; 
		}
		case 2: {
			return "Kettő";
		}
		case 3: {
			return "Három";
		}
		case 4: {
			return "Négy";
		}
		case 5: {
			return "Öt";
		}
		case 6: {
			return "Hat";
		}
		case 7: {
			return "Hét";
		}
		case 8: {
			return "Nyolc";
		}
		case 9: {
			return "Kilenc";
		}
		default: {
			return "";
		}
		}	
	}

	private static String calculateTens(int tens, int ones) {
		switch (tens) {
		case 1: {
			if(ones > 0) {
				return "Tizen"; 
			} else {
				return "Tíz";
			}
		}
		case 2: {
			if(ones > 0) {
				return "Huszon";
			} else {
				return "Húsz";
			}
		}
		case 3: {
			return "Harminc";
		}
		case 4: {
			return "Negyven";
		}
		case 5: {
			return "Ötven";
		}
		case 6: {
			return "Hatvan";
		}
		case 7: {
			return "Hetven";
		}
		case 8: {
			return "Nyolcvan";
		}
		case 9: {
			return "Kilencven";
		}
		default: {
			return "";
		}
		}
	}
}