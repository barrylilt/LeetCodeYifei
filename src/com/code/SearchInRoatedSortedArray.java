package com.code;

public class SearchInRoatedSortedArray {
	public static int search(int[] nums, int target) {
        if(nums==null ||nums.length==0){
	            return -1;
	        }
       
       int start=0;
       int end=nums.length-1;
       int mid;
       
       while(start+1<end){
           mid=start+(end-start)/2;
           
           if(nums[mid]==target){
               return mid;
           }
           
           if(nums[start]<nums[mid]){
               if(nums[start]<=target && target<=nums[mid]){
                   end=mid;
               }else{
                   start=mid;
               }               
           }
           
           else{
               if(nums[mid]<=target && target<=nums[end]){
                   start=mid;
               }else{
                   end=mid;
               }
           }
                      
       }//while
       
       if(nums[start]==target){
           return start;
       }
       
       if(nums[end]==target){
           return end;
       }
       
       return -1;
   }
	
	public static void main(String arg[]){
		int[] nums={4,5,6,7,0,1,2};
		
		int target=2;
		
		System.out.println(search(nums, target));
	}
}
