package com.dsa.basic;

public class PrimeNumber {

	public static void prime(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;

			}

		}
		if (count == 2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

	public static void notPrime(int n) {
		int count = 0;
		for (int i = 1; (i * i) <= n; i++) {
			if (n % i == 0) {
				count++;
				if ((n / i) != i)
					count++;
			}

		}
		if (count == 2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

	public static void main(String[] args) {
		int n = 14;
		prime(n);
		notPrime(n);

	}

}
