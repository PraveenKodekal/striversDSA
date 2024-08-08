package com.dsa.sorting;

public class InsertionSort1 {
	
	public static void main(String[] args) {
		int arr[]= {4,6,7,2,9,5};
		insertion(arr);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

		ascending(arr);
		for(int j=0; j<=arr.length-1;j++) {
			System.out.print(arr[j]);
		}
	}

	private static void ascending(int[] arr) {

		for(int i=0;i<=arr.length-2;i++) {
			int min=i;
			for(int j=i;j<=arr.length-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}

	private static void insertion(int[] arr) {

		for(int i=0; i<=arr.length-1;i++) {
			int j=i;
			while(j>0 && arr[j-1]<arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
	}

}
