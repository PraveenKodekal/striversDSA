package com.dsa.array;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {3,6,6,8,1,9};
		int n=3;
		System.out.println(search(arr,n));
	}
	
	static int search(int [] arr, int n) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				index=i;
				break;
			}
		}
		
		return index;
	}

}
