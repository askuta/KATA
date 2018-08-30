package com.java.loops;

import java.util.Random;

public class E03_Loops {

	private static final int ARRAY_SIZE = 10;
	private static final int RANDOM_NUMBER_BOUND = 100;

	public static void main(String[] args) {
		int[] array = generateRandomArray();
		writeArray(array);
		largestNumber(array);
		leastNumber(array);
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
	}

	private static void largestNumber(int[] array) {
		int largestNumber = array[0];
		for (int index = 0; index < array.length; index++) {
			if (array[index] > largestNumber) {
				largestNumber = array[index];
			}
		}
		System.out.println("Legnagyobb szám ezek közül:" + largestNumber);
	}

	private static void leastNumber(int[] array) {
		int leastNumber = array[0];
		for (int index = 0; index < array.length; index++) {
			if (array[index] < leastNumber) {
				leastNumber = array[index];
			}
		}
		System.out.println("Legkisebb szám ezek közül:" + leastNumber);
	}
}
