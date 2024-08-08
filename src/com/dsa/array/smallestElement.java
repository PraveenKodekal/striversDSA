package com.dsa.array;

public class smallestElement {
	public static void main(String[] args) {
		int [] arr= {3,3,5,8,3,7,8,9};
		System.out.println(smallest(arr));
	}

	private static int smallest(int[] arr) {
		int small=arr[0];
		for(int i=0; i<=arr.length-1;i++) {
			if(small>arr[i]) {
				small=arr[i];
			}
		}
		return small;
	}

}
