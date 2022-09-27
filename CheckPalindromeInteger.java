package com.example.arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * Program to check if a number is a palindrome in nature
 * */
public class CheckPalindromeInteger {

	public static void main(String[] args) {
		int num = 123;
		int num2 = 1221;
		System.out.println("Is Palindrome : "+is_Palindrome(num));
		System.out.println("Is Palindrome : "+is_Palindrome(num2));
	}
	
	public static boolean is_Palindrome(int num) {
		int n = num;
		int i = 0;
		List<Integer> eDigits = new ArrayList<Integer>();
		while(n!=0) {
			int rem = n%10;
			n = n/10;
			eDigits.add(rem);
		}
		int eLen = eDigits.size();
		i=eLen-1;
		for(int j=0;j<eLen;j++) {
			if(eDigits.get(i)!=eDigits.get(j)) {
				return false;
			}
			i--;
		}
		return true;
	}

}
