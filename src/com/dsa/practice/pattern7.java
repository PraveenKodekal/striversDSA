package com.dsa.practice;

/**
 * pattern7 12345 1234 123 12 1
 */
public class pattern7 {

	static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int n = 10;
		pattern7(n);
	}

}
