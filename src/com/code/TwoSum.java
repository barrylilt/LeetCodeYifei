

package com.code;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	 public static int[] twoSum(int[] nums, int target) {
	       HashMap<Integer, Integer> map =new HashMap<>();
	       
	       for(int i=0; i< nums.length; i++){
	           map.put(nums[i], i);
	       }
	       
	       for(int i=0; i<nums.length; i++){
	          int complement=target-nums[i];
	          if(map.containsKey(complement)&&map.get(complement)!=i){
	              return new int[]{i, map.get(complement)};
	          }
	           
	       }
	       throw new IllegalArgumentException("No two sum solution");
	    }
	 
	 public static void main(String arg[]){
		 int[] arr={1,3,5,4,7};
		 
		 System.out.println(Arrays.toString(twoSum(arr, 9)));
	 }
}
