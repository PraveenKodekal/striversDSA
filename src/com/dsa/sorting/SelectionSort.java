package com.dsa.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 6, 3, 9, 5, 7 };
		descending(arr);

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		ascending(arr);
		for (int j = 0; j <= arr.length - 1; j++) {
			System.out.print(arr[j] + " ");
		}

	}

	private static void ascending(int[] arr) {
		int n = arr.length;
		for (int i = 0; i <= n - 1; i++) {
			int min = i;
			for (int j = 0; j <= n - 1; j++) {
				if (arr[j] > arr[min]) {
					min = j;
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}

		}

	}

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
}
