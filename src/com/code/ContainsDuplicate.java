/*217. Contains Duplicate
 * 
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice 
 * in the array, and it should return false if every element is distinct.
 */


package com.code;

import java.util.LinkedHashSet;

public class ContainsDuplicate {
	 public boolean containsDuplicate(int[] nums) {
	        LinkedHashSet<Integer> list=new LinkedHashSet<>();
	        
	         for(int i=0; i<nums.length; i++){
				 list.add(nums[i]);			 
			 }
	        
	        if(list.size()<nums.length) return true;
	        else return false;
	    }
}
