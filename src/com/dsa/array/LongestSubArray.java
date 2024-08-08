package com.dsa.array;

public class LongestSubArray {
	
	public static void main(String[] args) {
		int[] arr= {2, 3, 5, 1, 9};
		int num=10;
		System.out.println(longestSubArray(arr,num));
		
	}
	
	static int longestSubArray(int arr[], int num) {
		int length=0;
		
		for(int i=0; i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				
				sum+=arr[j];
			
				if(sum==num) {
					length=Math.max(length, j-i+1);
				}
			}
		}
		
		return length;
	}

}
