package com.code;

public class ClassicalBinarySearch {
	public static int findPosition(int[] nums, int target){
		if(nums==null || nums.length==0){
			return -1;
		}
		
		int start=0; 
		int end=nums.length-1;
		
		while(start+1<end){
			int mid=start+(end-start)/2;
			
			if(nums[mid]==target){
				return mid;
			}
			
			if(nums[mid]<target){
				start=mid+1;
			}
			
			if(nums[mid]>target){
				end=mid-1;
			}
		}
		
		if(nums[start]==target){
			return start;
		}
		
		if(nums[end]==target){
			return end;
		}
		return -1;
	}
	
	public static void main(String arg[]){
		int[] nums={1,2,3,4,4,5,6};
		int target=4;
		
		System.out.println(findPosition(nums, target));
	}
}
