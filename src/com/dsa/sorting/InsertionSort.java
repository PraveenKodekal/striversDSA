package com.dsa.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {1,8,3,4,6,7,2};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void insertionSort(int[] arr) {

		int n=arr.length;
		for(int i=0;i<=n-1;i++) {
			int j=i;
			while(j>0 && arr[j-1] < arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
			
		}
	}

}
