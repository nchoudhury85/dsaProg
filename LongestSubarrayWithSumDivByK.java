package com.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumDivByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,6,1,4,5};
		int n = arr.length;
		int k = 3;
		System.out.println("Max subArray size : "+optimizedMaxSubArraySize(arr, n, k));
	}
	static int optimizedMaxSubArraySize(int[] arr, int n, int k) {
		Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
 
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            // to handle negavtive values as well
            int mod = ((sum % k) + k) % k;
 
            // this will be the longest possible length from
            // start
            if (mod == 0)
                max = i + 1;
 
            if (!map.containsKey(mod))
                map.put(mod, i);
            else {
                int sz = i - map.get(mod);
                max = Math.max(max, sz);
            }
        }
 
        return max;
    }
	
	static int longSubarrayWithDivSum(int[] arr, int n, int k) {
		HashMap<Integer, Integer> um= new HashMap<Integer, Integer>();
        
        // 'mod_arr[i]' stores (sum[0..i] % k)
        int mod_arr[]= new int[n];
        int max = 0;
        int curr_sum = 0;
         
        // traverse arr[] and build up the
        // array 'mod_arr[]'
        for (int i = 0; i < n; i++)
        {
            curr_sum += arr[i];
             
            // as the sum can be negative,
            // taking modulo twice
            mod_arr[i] = ((curr_sum % k) + k) % k;    
        }
         
        for (int i = 0; i < n; i++)
        {
            // if true then sum(0..i) is
            // divisible by k
            if (mod_arr[i] == 0)
                // update 'max'
                max = i + 1;
            else if (um.containsKey(mod_arr[i]) == false)
                um.put(mod_arr[i] , i);
                 
            else
                // if true, then update 'max'
                if (max < (i - um.get(mod_arr[i])))
                    max = i - um.get(mod_arr[i]);
        }
        return max;
	}
}
