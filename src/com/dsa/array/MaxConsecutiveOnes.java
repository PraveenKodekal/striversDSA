package com.dsa.array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int arr[] = { 1,1,1,1,1,1,1,1,1,1,0,0 };
		System.out.println(repeatChars(arr));
	}

	static int repeatChars(int[] arr) {

		int count=0;
		int max=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				count++;
			}else {
				count=0;
			}max= Math.max(count, max);
		}
		 

		return max;

	}

}
