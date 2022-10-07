package com.example.arrays;

public class KWindowSum {

	public static void main(String[] args) {
		int k=4;
		int[] arr = {1,9,-1,-2,7,3,-1,2};
		int start = 0;
		int end =0;
		int windowSum = 0;
		int maxSum=0;
		while(end<k) {
			windowSum+=arr[end++];
		}
		int len = arr.length;
		while(end<len) {
			windowSum+=arr[end++]-arr[start++];
			maxSum = Math.max(maxSum, windowSum);
		}
		System.out.println("Maximum Sum = "+maxSum);
	}

}
