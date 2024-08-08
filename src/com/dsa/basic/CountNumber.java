package com.dsa.basic;

public class CountNumber {

	public static void countN(int n) {
		int c = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			n = n / 10;
			c++;
		}
		System.out.println(c);
	}
	
	public static int countNum(int n) {
		int count=0;
		while(n>0) {
			count=count+1;
			n=n/10;
		}
		return count;
	}
	
	public static int countLog(int n) {
		int count=(int) Math.log10(n)+1;
		
		return count;
	}

	public static void main(String[] args) {
		int n = 12;
		countN(n);
		System.out.println(countNum(n));
		System.out.println(countLog(n));

	}

}
