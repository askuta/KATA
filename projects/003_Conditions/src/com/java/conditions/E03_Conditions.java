package com.java.conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E03_Conditions {
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
			System.out.println("ketto");
			break;
		}
		case 3: {
			System.out.println("harom");
			break;
		}
		case 4: {
			System.out.println("negy");
			break;
		}
		case 5: {
			System.out.println("ot");
			break;
		}
		case 6: {
			System.out.println("hat");
			break;
		}
		case 7: {
			System.out.println("het");
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
			System.out.println("tiz");
			break;
		}
		}
	}
}
