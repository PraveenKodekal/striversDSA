package com.dsa.array;

public class LargestElement {
	
	public static void main(String[] args) {
		int arr[]= {3,9,6,1,8,2,5,10};
		
		System.out.println(largest(arr));
		
	}

	private static int largest(int[] arr) {
		int large=arr[0];
		for(int i=0; i<=arr.length-1;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
		}
		return large;
		
	}

}
