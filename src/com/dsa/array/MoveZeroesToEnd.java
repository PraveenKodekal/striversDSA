package com.dsa.array;

import java.util.ArrayList;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 3, 0, 4, 0, 6, 7 };
		moveEnd(arr);
		for (int moveZero : arr)
			System.out.print(moveZero + " ");
	}

	static int[] moveEnd(int arr[]) {
		int temp = 0;
		for (int j = 0; j < arr.length-1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == temp) {
					arr[i] = arr[i + 1];
				}
			}arr[j+1]=temp;
		}

		return arr; 
	}

	static int[] moveToEnd(int[] arr) {
		// take nonZero element and store it in temp
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp.add(arr[i]);
			}
		}
		for (int i = 0; i < temp.size(); i++) {
			arr[i] = temp.get(i);
		}
		for (int i = temp.size(); i < arr.length; i++) {
			arr[i] = 0;
		}
		return arr;
	}

}
