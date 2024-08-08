package com.dsa.practice;

public class pattern4 {
	
	static void pattern4(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n;j++) {
				System.out.print(j);
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n=7;
		pattern4(n);
	}

}
