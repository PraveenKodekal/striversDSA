package com.dsa.array;

public class SecondLargest2 {
	public static void main(String[] args) {
		int [] arr= {1,5,3,9,7,9,8,4,6};
		System.out.println(secondL(arr));
		System.out.println(secondSmallest(arr));
	}

	private static int secondSmallest(int[] arr) {
		int sSmallest=Integer.MAX_VALUE;
		int smallest=arr[0];
		int n= arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i]<smallest) {
				sSmallest=smallest;
				smallest=arr[i];
				
			}
			else if(arr[i]!=smallest && arr[i]<sSmallest  ) {
				sSmallest=arr[i];
			}
		}
		
		
		
		return sSmallest;
	}

	private static int secondL(int[] arr) {

		int largest=arr[0];
		int second=-1;
		int n= arr.length;
		
		for(int i=0; i<=n-1;i++) {
			if(arr[i]>largest) {
				
				second= largest;
				largest=arr[i];
				
			}
			else if(arr[i]<largest && arr[i]>second) {
				second=arr[i];
			}
		}
		return second;
	}

}
