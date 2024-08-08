package com.dsa.practice;

/**
 * pattern6 1
 * 			2 2
 * 			3 3 3
 * 			4 4 4 4
 * 
 */
public class Pattern6 {
	static void pattern6(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(i+" ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n=6;
		pattern6(n);
	}

}
