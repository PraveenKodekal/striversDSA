package com.dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindUnique {

	public static void main(String[] args) {
		int arr1[]= {1,2,4,6,7};
		int arr2[]= {1,4,6,8,2};
		System.out.println(unionOfTwo(arr1, arr2));
		
	}
	
	static int[] unionOfTwo(int arr1[], int arr2[]) {
		int[] unionArr=new int[100];
		HashSet<Integer> freq=new HashSet<>();
		ArrayList<Integer>union=new ArrayList();
		
		int n= arr1.length;
		int m= arr2.length;
		// add array1 elements to hashset
		for(int i=0;i<n;i++) {
			freq.add(arr1[i]);
		}
		// add array2 elements to hashSet
		for(int i=0;i<m;i++) {
			freq.add(arr2[i]);
		}
		//hashSet returns unique elements
		//add hashSetElemts to ArrayList
		
		for(int addBoth:freq)
			union.add(addBoth);
		
		Object[] unuionArr=union.toArray();
		
		return unionArr;
	}
	

}
