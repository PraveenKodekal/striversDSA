package com.dsa.practice;

/**
 * Pattern-- * *** *****
 */
public class Pattern8 {

	static void pattern8(int n) {
		for (int i = 0; i < n; i++) {
			// for before space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			// for to print the star
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			// for after space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 3;
		pattern8(n);
	}

}
