package com.java.conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class C02_IfCondition {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Random random = new Random();
		int randomNumber = random.nextInt(101);

		String line;
		System.out.println("Gondoltam egy számot 0-100-ig. Találd ki!");
		while (true) {
			line = reader.readLine();
			int myNumber = Integer.parseInt(line);

			if (myNumber < randomNumber) {
				System.out.println("A begépelt szám kisebb.");
			} else if (myNumber > randomNumber) {
				System.out.println("A begépelt szám nagyobb.");
			} else {
				System.out.println("A két szám egyenlő.");
				break;
			}
		}
	}
}
