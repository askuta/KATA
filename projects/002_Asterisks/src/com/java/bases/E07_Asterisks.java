package com.java.bases;

public class E07_Asterisks {
	private static final int CENTER_X = 1;
	private static final int CENTER_Y = 1;
	private static final int RADIUS = 10;

	public static void main(String[] args) {
		for (int x = 0; x < 21; x++) {
			for (int y = 0; y < 21; y++) {
				if (isInside(x, y)) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	private static boolean isInside(int x, int y) {
		return Math.pow(CENTER_X - x, 2) + Math.pow(CENTER_Y - y, 2) <= Math.pow(RADIUS, 2);
	}
}
