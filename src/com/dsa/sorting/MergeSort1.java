package com.dsa.sorting;

import java.util.ArrayList;

public class MergeSort1 {
	public static void main(String[] args) {
		int arr[]= {1,5,1,3,7,8,5,2,9,4};
		int low =0;
		int high=arr.length-1;
		
		mergerSort(arr,high,low);
		
	}

	private static void mergerSort(int[] arr, int high, int low) {
		
		if(low>=high) return;
		int mid=(low+high)/2;
		mergerSort(arr, low, high);
		mergerSort(arr, mid+1, high);
		merge(arr, low, mid, high);
		
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp= new ArrayList<>();
		int left=low;
		int right=high;
		
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
			
		}
			while(left<=mid) {
				temp.add(arr[left]);
				left++;
			}
			while(right<=high) {
				temp.add(arr[right]);
				right++;
			}
			for (int i = low; i <= high; i++) {
				arr[i] = temp.get(i - low);
			}
		
		
	}

}
