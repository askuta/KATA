package com.java.loops;

import java.util.Random;

public class E05_Loops {

	private static final int ARRAY_SIZE = 10;
	private static final int RANDOM_NUMBER_BOUND = 100;

	public static void main(String[] args) {
		int[] array = generateRandomArray();

		System.out.println("A generált számok:");
		writeArray(array);

		swapAllNumbers(array);

		System.out.println("Fordított sorrendben a számok:");
		writeArray(array);
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

	private static void swapAllNumbers(int[] array) {
		for (int index = 0; index < array.length / 2; index++) {
			int swapBox = array[index];
			array[index] = array[ARRAY_SIZE - index - 1];
			array[ARRAY_SIZE - index - 1] = swapBox;
		}
	}
}