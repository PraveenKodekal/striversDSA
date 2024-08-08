package com.dsa.basic;

public class PrintDivisors {
	
	public static void divisors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+",");
			}
		}
		
	}

	public static void main(String[] args) {
		int n=897;
		divisors(n);

	}

}
