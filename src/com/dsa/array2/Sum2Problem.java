package com.dsa.array2;



/**
 * given an array, return true if sum of any two elements are equal to target
 * 
 *ex: int []arr={1,4,6,8,3}; target =13 return false;
 *	  if target is 14 (6+8=14) return true;	
 * 
 */
public class Sum2Problem {
	public static void main(String[] args) {
		int[] arr= {1,4,6,8,3};
		int target=13;
		System.out.println(sum2(arr,target));
		
	}

	 static boolean sum2(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target)
					return true;
			}
			
		}
		return false;
	}

}
