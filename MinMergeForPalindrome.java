package com.example.arrays;

public class MinMergeForPalindrome {

	public static void main(String[] args) {
		int[] arr = {1,3,5,9,1};
		int count = noOfMerges(arr);
		System.out.println("No. of merges required : "+count);
	}
	
	public static int noOfMerges(int[] A) {
		
		int j = A.length -1;
		int len = A.length;
		int count=0;
		for(int i=0;i<=j;i++) {
			if(A[i] == A[j]) {
				i++;
				j--;
			} else if(A[i] > A[j]) {
				A[j]=A[j]+A[j+1];
				j--;
				count++;
			} else if(A[i]<A[j]) {
				A[i] = A[i]+A[i-1];
				i++;
				count++;
			}
		}
		return count;
	}

}
