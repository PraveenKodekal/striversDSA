package com.dsa.array;

public class secondLargestAndSmallest {
	
	public static void main(String[] args) {
		int [] arr= {2,1,10,5,8,9,3,4,6,3,2,9};
		System.out.println(secondLargest(arr));
		System.out.println(secondSmallest(arr));
		//System.out.println(largest(arr));
	}

	private static int largest(int[] arr) {
		int largets=arr[0];
		int secondLargest=1;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>largets) {
				largets=arr[i];
			}
		}
		for(int j=0;j<arr.length-1;j++) {
			if(secondLargest<arr[j]&& arr[j]!=largets) {
				secondLargest=arr[j];
			}
		}
		
		
		return secondLargest;
	}

	private static int secondSmallest(int[] arr) {

		int secondSmall=Integer.MAX_VALUE;
		int small=arr[0];
		int n= arr.length;
		
		for(int i=0; i<n;i++) {
			if(arr[i]<small) {
				secondSmall=small;
				small=arr[i];
			}
			else if(arr[i]!=small && arr[i]>secondSmall) {
				secondSmall=arr[i];
			}
		}
		return secondSmall;
	}

	private static int secondLargest(int[] arr) {
		int large=arr[0];
		int secondLarge= -1;
		int n= arr.length;
		
		for(int i=0; i<n;i++) {
			if(arr[i]>large) {
				secondLarge=large;
				large=arr[i];
			}
			else if(arr[i]<large && arr[i]>secondLarge) {
				secondLarge=arr[i];
			}
		}
		
		return secondLarge;
	}
	
	
	

}
