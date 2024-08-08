package com.dsa.array;

import java.util.ArrayList;

public class moveZeroesToFront {
	public static void main(String[] args) {
		int[]arr= {1,2,4,5,0,5,3,0,1,0,0};
		
		moveToFront(arr);
		for(int front:arr)
			System.out.print(front+" ");
	}
	
	static int[] moveToFront(int [] arr) {
		
		ArrayList<Integer> temp=new ArrayList<>();
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=0) {
				temp.add(arr[i]);
			}
		}
		for(int i=0;i<temp.size();i++) {
			arr[i]=0;
		}
		for(int i=temp.size();i<arr.length;i++) {
			arr[i]=temp.get(i);
		}
		return arr;
	}

}
