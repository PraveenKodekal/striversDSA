package com.dsa.practice;



/**
 * pattern5 1
 * 			1 2
 * 			1 2 3
 * 			1 2 3 4
 * 
 */
public class Pattern5 {
	
	static void pattern5(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n=7;
		pattern5(n);
	}

}
