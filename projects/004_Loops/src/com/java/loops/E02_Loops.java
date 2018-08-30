package com.java.loops;

import java.util.Random;

public class E02_Loops {

	private static final int ARRAY_SIZE = 10;
	private static final int RANDOM_NUMBER_BOUND = 100;

	public static void main(String[] args) {
		System.out.println("A generált számok:");

		int[] array = generateRandomArray();
		writeArray(array);
		int sumArrayNumbers = sumArrayNumbers(array);

		System.out.println("Az összegük:" + sumArrayNumbers);
	}

	private static int[] generateRandomArray() {
		Random random = new Random();

		int[] array = new int[ARRAY_SIZE];
		for (int index = 0; index < array.length; index++) {
			array[index] = random.nextInt(RANDOM_NUMBER_BOUND);
		}

		return array;
	}

	private static void writeArray(int[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
	}

	private static int sumArrayNumbers(int[] array) {
		int sum = 0;
		for (int number : array) {
			sum = sum + number;
		}

		return sum;
	}
}
