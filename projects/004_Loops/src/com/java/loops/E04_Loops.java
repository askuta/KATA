package com.java.loops;

import java.util.Random;

public class E04_Loops {

	private static final int ARRAY_SIZE = 10;
	private static final int RANDOM_NUMBER_BOUND = 100;

	public static void main(String[] args) {
		int[] array = generateRandomArray();
		writeArray(array);
		System.out.println();
		swapFirstLastNumbers(array);
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
		System.out.println("A generált számok:");
		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
		System.out.println("Legelső szám ezek közül: " + array[0]);
		System.out.println("Legutolsó szám ezek közül: " + array[ARRAY_SIZE - 1]);
	}

	private static void swapFirstLastNumbers(int[] array) {
		int swapBox = 0;
		swapBox = array[0];
		array[0] = array[ARRAY_SIZE - 1];
		array[ARRAY_SIZE - 1] = swapBox;
	}
}
