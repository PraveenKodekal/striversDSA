package com.dsa.basic;

public class ReverseNum {

	public static int reverse(int n) {
		int rev = 0;
		int dup = n;

		while (n > 0) {
			int lastDigit = n % 10;
			rev = (rev * 10) + lastDigit;
			n = n / 10;
		}
		
		return rev;
		
	}

	public static void main(String[] args) {
		int n = 7789877;
		System.out.println(reverse(n));
		
		
	}

}
