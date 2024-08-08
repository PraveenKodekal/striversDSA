package com.dsa.recursion;

public class printSum {

	static int sum = 0;

	static int fun(int i, int n) {

		if (i <= n) {
			sum = sum + i;

			fun(i + 1, n);
		}
		return sum;
	}

	// Parametersied recursion
	static void sumT(int i, int sum) {

		if (i < 1) {
			System.out.println(sum);
			return;
		}
		sumT(i - 1, sum + i);

	}

	// functional recursion
	static int sum3(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum3(n - 1);
	}
	
	

	public static void main(String[] args) {
		int i = 1, n = 3;
		int x=3;
		sum = 0;
		int s=0;

		System.out.println(fun(i, n));
		System.out.println(sum3(n));
		sumT(x, sum);

	}

}
