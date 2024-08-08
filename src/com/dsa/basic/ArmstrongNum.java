package com.dsa.basic;

public class ArmstrongNum {
	
	
	public static int arm(int n) {
		int sum=0;
		int dup=n;
		while(n>0) {
			int lastDigit=n%10;
			sum+=(lastDigit*lastDigit*lastDigit);
			n=n/10;
		}
		if(sum==dup)
			System.out.println("armstrong");
		else
			System.out.println("legstrong");
		return sum;
	}

	public static void main(String[] args) {
		int n=153 ;
		arm(n);

	}

}
