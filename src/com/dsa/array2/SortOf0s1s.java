package com.dsa.array2;



/**
 * giver an array return an sorted array in ascending order
 * int[] arr= {0,1,0,2,1,2}; result : [0,0,1,1,2,2};
 */
public class SortOf0s1s {
	public static void main(String[] args) {
		int[] arr= {0,1,4,5,8,9,2,4,1,8,9,3,6,2,1,0,9,2,5,0,2,1,2};
		sortArray(arr);
		for(int nums:arr) {
			System.out.print(nums+" ");
		}
	}
	
	static int[] sortArray(int[] arr) {
		
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
		
		return arr;
	}
	
	

}
