package com.dsa.basic;

public class Palindrome {

	public static int palin(int n) {
		int rev=0;
		while(n>0) {
			int lastDigit=n%10;
			rev=(rev*10)+lastDigit;
			n=n/10;
			
		}
		return rev;
	}
		

	public static void main(String[] args) {
		
		int n=1231321;
		palin(n);
		if(n==palin(n))
			System.out.println("palin");
		else
			System.out.println("not");

	}

}
