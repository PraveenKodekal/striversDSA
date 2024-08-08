package com.dsa.array;

public class LongestSubArrayWithPostivesAndNegatives {
	
	public static void main(String[] args) {
		int [] arr= {-1,1,1};
		int k=1;
		System.out.println(longestarray(arr,k));
		
	}
	
	static int longestarray(int[] arr, int num) {
		int len=0;
		
		for(int i=0; i<arr.length;i++) {
			int sum=0;
			for(int j=0; j<arr.length;j++) {
				sum+=arr[j];
				
				if(sum==num)
					len=Math.max(len, j-i+1);
			}
			
		}
		
		
		
		return len;
	}
	
	

}
