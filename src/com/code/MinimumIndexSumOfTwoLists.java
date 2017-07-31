package com.code;

import java.util.ArrayList;

public class MinimumIndexSumOfTwoLists {
	 public static String[] findRestaurant(String[] list1, String[] list2) {
	        ArrayList<String> arr=new ArrayList<String>();
	        int min=list1.length+list2.length-2;
	        
	        for(int i=0; i<list1.length; i++){
	            for(int j=0; j<list2.length; j++){
	                if (list1[i].equals(list2[j])){
	                    if(min>=(i+j)){
	                        arr.add(list1[i]);
	                        min=i+j;
	                    }
	                }
	                
	            }
	        }
	        String[] result = new String[arr.size()];
	        result = arr.toArray(result);
	        return result;
	    }
	 
	 public static void main(String arg[]){
		 String[] arr1=new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
		 String[] arr2=new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		 
			System.out.println(findRestaurant(arr1, arr2 ));
		 }  
}
