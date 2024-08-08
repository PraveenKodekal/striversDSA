package com.dsa.basic;

public class PrintNumbers {
	
	static void print(int n) {
		
		while(n>0) {
			int lastDigit= n%10;
			System.out.print(lastDigit);
			n=n/10;
		}
		
	}
	
	public static void main(String[] args) {
		int n=56743;
		print(n);
		
		
	}

}
