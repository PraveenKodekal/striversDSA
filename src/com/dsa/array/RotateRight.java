package com.dsa.array;

public class RotateRight {
	
	public static void main(String[] args) {
		int [] arr= {3,5,1,6,8};
		//o/p={8,3,5,1,6}
		rorateRight(arr);
		for(int a :arr) {
			System.out.println(a);
		}
		
	}
	
	static int[] rorateRight(int []arr) {
		int temp = arr[arr.length-1];
		for(int i=0;i<=arr.length;i++) {
			arr[0]=temp;
			arr[arr.length-1]=arr[i];
		}
		//arr[0]=temp; 
		return arr;
	}

}
