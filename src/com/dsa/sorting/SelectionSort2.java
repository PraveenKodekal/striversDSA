package com.dsa.sorting;

public class SelectionSort2 {
	
	static void descending(int arr[]) {
		
		int n=arr.length;
		
		
		for(int i=0; i<=n-2;i++) {
			int max=i;
			for(int j=i;j<=n-1;j++) {
				if(arr[j]>arr[max]) {
					max=j;
				}
			}
			int temp=arr[max];
			arr[max]=arr[i];
			arr[i]=temp;
			
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {3,6,9,5,4,1,7};
		descending(arr);
		
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
	}

}
