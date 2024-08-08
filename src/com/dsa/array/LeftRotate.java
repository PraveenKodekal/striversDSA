package com.dsa.array;

public class LeftRotate {
	
	public static void main(String[] args) {
		int [] arr= {3,5,7,9,1};
		//rotate it left
		// o/p = 5,7,9,1,3
		
		rotateLeft(arr);
		for(int rotate : arr) {
			System.out.print(rotate);
		}
	}
	
	static int[] rotateLeft(int[] arr) {
		int temp=arr[0];
		int n= arr.length;
		
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;  
		return arr;
	}

}
