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
			System.out.println("ketto");
		} else if (yourNumber == 3) {
			System.out.println("harom");
		} else if (yourNumber == 4) {
			System.out.println("negy");
		} else if (yourNumber == 5) {
			System.out.println("ot");
		} else if (yourNumber == 6) {
			System.out.println("hat");
		} else if (yourNumber == 7) {
			System.out.println("het");
		} else if (yourNumber == 8) {
			System.out.println("nyolc");
		} else if (yourNumber == 9) {
			System.out.println("kilenc");
		} else if (yourNumber == 10) {
			System.out.println("tiz");
		} else {
			System.out.println("Ejnye-bejnye. Nem ez volt a feladat..");
		}
	}
}