/*422. Find All Duplicates in an Array (Medium)
 * 
 * Given an array of integers, 
 * some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 * Could you do it without extra space and in O(n) runtime?
 * 
 * Input:
 * [4,3,2,7,8,2,3,1]
 * 
 * Output:
 * [2,3]
 */

package com.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindAllDuplicatesInAnArray {
	 public ArrayList<Integer> findDuplicates(int[] nums) {
	        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        
	        for(int i=0; i<nums.length; i++){
	            
	            if(!map.containsKey(nums[i])){
	                map.put(nums[i], 1);
	            }
	            else{
	            int newvalue=map.get(nums[i])+1;
	            map.put(nums[i], newvalue);
	            }
	        }
	        
	        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
	            if(entry.getValue()==2){
	                list.add(entry.getKey());
	            }
	                
	        }
	        
	        return list;
	    }
}
