package com.dsa.array;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 8,3,5,4,6};
		System.out.println("Missing Number is -- " + missingNumber(arr));
	}

	static int missingNumber(int arr[]) {
		int numberMissed = 0;
		int sum1 = 0;
		int sum2 = 0;
		int n=arr.length;
		
		Arrays.sort(arr);
		

		int startNumber = arr[0];
		int endNumber = arr[arr.length-1];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum1 =sum1+arr[i];

		}

		for (int i = startNumber; i <=endNumber; i++) {
			System.out.print(i+" ");
			sum2=sum2+i;
			
		}

		
		numberMissed = sum2 - sum1;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(endNumber);

		return numberMissed;
	}

}
