package com.dsa.recursion;

public class recursion1 {
	static int count=0;
	public static void f1() {
		
		if(count==7) {
			System.out.println(count);
			return;
		}
		
		count++;
		f1();
		
		
	}
	
	public static void main(String[] args) {
		f1();
	}

}
