package com.dsa.array;

public class RotateRightByN {
	
	static int[] rotateRight(int[] arr, int d) {
		int n=arr.length;
		System.out.println(n);
		reverse(arr, n-d, n-1); //3,5,7,9,6,4,1
		reverse(arr,0,n-1);     //1,6,4,9,7,5,3
		reverse(arr,d,n-1);	    //1,6,4,3,5,7,9
		return arr;
	}
	
	static int []reverse(int[] arr, int start, int end){
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
	
	static int[] rotateLeft(int []arr, int d){
		
		int n= arr.length;
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		
		return arr;
	}
	public static void main(String[] args) {
		int [] arr= {3,5,7,9,1,6,4,7};
		int d=5;  // 1,6,4,3,5,7,9
		rotateRight(arr,d);
		//rotateLeft(arr, d);
		
		for(int rightRotate:arr)
			System.out.print(rightRotate+" ");
	}

}
