package com.dsa.array;

public class SecondLargest {
	public static void main(String[] args) {
		int [] arr= {3,5,9,8,7,8,2,1,9,9,9};
		System.out.println(secondLarge(arr));
	}

	private static int secondLarge(int[] arr) {
		int largest = arr[0];
		for(int i=0; i<=arr.length-1;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		int secondL=1;
		for(int j=0;j<arr.length;j++) {
			if(secondL<arr[j]&& arr[j]!=largest) {
				secondL=arr[j];
				
			}
		}
		return secondL;
	}

}
