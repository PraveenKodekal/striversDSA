package com.dsa.sorting;

import java.util.ArrayList;

public class MergerSort {

	static void merge(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;

		merge(arr, low, mid);
		merge(arr, mid + 1, high);
		mergeSort(arr, low, mid, high);

	}

	private static void mergeSort(int[] arr, int low, int mid, int high) {

		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}
		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}

		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 2, 3, 1, 4, 5, 6 };
		int low = 0;
		int high = arr.length - 1;
		System.out.println(high);
		merge(arr, low, high);
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i]);
		}
	}
}
