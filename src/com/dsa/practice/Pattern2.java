package com.dsa.practice;


public class Pattern2 {
	
	public static void printPattern2(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}System.out.println();
		}
		
	
		
	}
	
	public static void main(String[] args) {
		int n=3;
		printPattern2(n);
		
	}

}
