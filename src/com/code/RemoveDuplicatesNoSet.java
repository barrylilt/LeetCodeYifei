package com.code;

import java.util.ArrayList;

public class RemoveDuplicatesNoSet {
	static int removeDuplicates(int[] arr){
		 
		     ArrayList<Integer> arrList = new ArrayList<Integer>();
		     int cnt=0;
		       
		          for(int i=0;i<arr.length;i++){
					for(int j=i+1;j<arr.length;j++){
					   if(arr[i]==arr[j]){
						 cnt+=1;
					   }                
					}
					if(cnt<1){
					  arrList.add(arr[i]);
					}
					  cnt=0;
		        }

		for(int k=0;k<arrList.size();k++){
		            System.out.println("Array without Duplicates: "+arrList.get(k));
		        }
		return arrList.size();
}
	
	public static void main(String arg[]){
		int[] array={1,1,2};
		System.out.println(removeDuplicates(array));
	}
}
