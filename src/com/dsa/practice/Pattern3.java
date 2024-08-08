package com.dsa.practice;



/**
 *   Pattern3-  *
 * 				* *
 * 				* * *
 */
/**
 *  if i=0 i<n -- j=o 
 * 
 */
public class Pattern3 {
	
	
	
	public static void pattern3(int n) {
		for(int i=0; i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int n=3;
		pattern3(n);
	}

}
