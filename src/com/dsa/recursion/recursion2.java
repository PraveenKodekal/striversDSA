package com.dsa.recursion;

public class recursion2 {
	
	public static void f2(int i, int n) {
		if(i>=n)return;
		System.out.println(i);
		f2(i+1, n);
		
	}
	
	public static void main(String[] args) {
		int n=4;
		int i=1;
		f2(i,n);
	}

}
