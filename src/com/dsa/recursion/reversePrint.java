package com.dsa.recursion;

public class reversePrint {
	
	public static void fun(int i, int n) {
		if(i>=n)return;
		System.out.println(n);
		fun(i, n-1);
	}
	
	public static void main(String[] args) {
		int i=0,n=5;
		fun(i,n);
	}

}
