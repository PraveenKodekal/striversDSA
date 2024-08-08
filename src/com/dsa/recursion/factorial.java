package com.dsa.recursion;

public class factorial {
	static int sum=1;
	
	static int fact(int i,int n) {
		if(i<=n) {
			sum=sum*i;
			fact(i+1, n);
		}
		
		return sum;
	}
	
	static void fact1(int i, int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		fact1(i-1, sum*i);
	}
	
	static int fac3(int n) {
		if(n==0) {
			return 1;
		}
		return n*fac3(n-1);
	}
	

	
	public static void main(String[] args) {
		
		int i=1; int n=10;
		System.out.println(fact(i, n));
		 sum=1;
		fact1(n,sum);
		System.out.println(fac3(n));
		
		
	}

}
