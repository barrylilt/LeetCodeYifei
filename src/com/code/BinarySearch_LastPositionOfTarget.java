package com.code;

public class BinarySearch_LastPositionOfTarget {

	public static int lastPosition(int[] nums, int target){
		if(nums==null || nums.length==0){
			return -1;
		}
		
		int start=0; 
		int end=nums.length-1;
		while(start+1<end){
			int mid=(start+end)/2;
			if(nums[mid]<target){
				start=mid;
			}else if(nums[mid]>target){
				end=mid;
			}else {
				start=mid;
			}
		}
		
		if(nums[end]==target){
			return end;
		}
		
		if(nums[start]==target){
			return start;
		}
		
		return -1;
		
	}
	
	public static void main(String arg[]){
	  int[] nums={1,2,2};
	  int target=2;
	  
	  System.out.println(lastPosition(nums, target));
	   
	}
}
