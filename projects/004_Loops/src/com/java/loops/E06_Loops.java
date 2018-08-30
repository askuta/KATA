package com.java.loops;

import java.util.Random;

public class E06_Loops {

	private static final int ARRAY_SIZE = 10;
	private static final int RANDOM_NUMBER_BOUND = 100;

	public static void main(String[] args) {
		int[] array = generateRandomArray();

		System.out.println("A generált számok:");
		writeArray(array);

		leastToLargest(array);

		System.out.println("Növekvő sorrendben a számok:");
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
			System.out.print("| " + String.format("%2d", array[index]) + " ");
		}
		System.out.println("|");
	}

	private static void leastToLargest(int[] array) {
		for (int index1 = array.length - 1; index1 > 0; index1--) {
			for (int index = 0; index < index1; index++) {
				if (array[index] > array[index + 1]) {
					int swapBox = array[index];
					array[index] = array[index + 1];
					array[index + 1] = swapBox;
				}
			}
		}
	}
}
