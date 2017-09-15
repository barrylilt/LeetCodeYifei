package com.code;

public class FindMinimumInRoatedSortedArray {
	 public static int findMin(int[] nums) {
	        if(nums==null ||nums.length==0){
	            return -1;
	        }
	        
	        int start=0, end=nums.length-1;
	        int target=nums[end];
	        
	        //find the first element <=target
	        
	        while(start+1<end){
	            int mid=start+(end-start)/2;
	            if(nums[mid]<=target){
	                end=mid;
	            }else{
	                start=mid;
	            }
	        }
	        
	        if(nums[start]<=target){
	            return nums[start];
	        }
	        
	        if(nums[end]<=target){
	            return nums[end];
	        }
	        
	        return -1;
	    }
	 
	 public static void main(String arg[]){
		 int[] nums={4,5,6,7,0,1,2};
		 
		 System.out.println(findMin(nums));
	 }
}
