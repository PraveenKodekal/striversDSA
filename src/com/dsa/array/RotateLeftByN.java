package com.dsa.array;

public class RotateLeftByN {

	static int[] rotateLeft(int[] arr, int d) {
		int n = arr.length;
		reverse(arr, 0, d - 1); // reverse upto d
		reverse(arr, d, n - 1); // reverse from d to remaiming
		reverse(arr, 0, n - 1); // reverse all new array

		return arr;
	}

	static int[] reverse(int arr[], int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 1, 7 };
		int d = 2;

		rotateLeft(arr, d);
		for (int rotate : arr)
			System.out.print(rotate + " ");
		
		System.out.println();
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
