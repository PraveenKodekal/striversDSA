package com.dsa.sorting;

public class SelectionSort1 {
	
	static int[] ascending(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			int min =i;
			
			for(int j=0;j<n;j++) {
				if(arr[j]>arr[min]) {
					min=j;
				}
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
				
			}
			
		}
		
		
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[] = {5,2,3,1,9,7,4};
		ascending(arr);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
