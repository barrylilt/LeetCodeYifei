package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
	 static ArrayList<Integer> topKFrequent(int[] nums, int k) {
	        
	       HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
	       
	        ArrayList<Integer> result=new ArrayList<>();
	    //calculate frequency of each unique number, add to HashMap, number as the key, count as the value    
	        for (Integer n : nums){
	           
	            if(!map.containsKey(n)) {
	            	map.put(n, 1);            	
	            }	            
	            else
	               map.put(n, map.get(n) + 1);    
	            	          
	        }
	
      //put all the count numbers to arraylist and then sort it, so we can get top k count numbers.
	        ArrayList<Integer> countlist=new ArrayList<>();
	        
	        for (Integer key : map.keySet()) {
	            countlist.add(map.get(key));    
	           
	        }
	        
	        Collections.sort(countlist);
	
      //loop through the count array, and use HashMap to find the key of each value, add them to result arraylist
	        for(int i=countlist.size()-1; i>=(countlist.size()-k); i--){
	           Integer value=countlist.get(i);
	         	       	        
	           for(Map.Entry<Integer, Integer> entry: map.entrySet()){
	               if(value.equals(entry.getValue())){
	                   Integer key = entry.getKey();
	                   result.add(key);
	                   map.remove(key);
	                   break; //breaking because its one to one map
	               }
	           }	 
	        }
	        	       
	        return result;	     
	    }
	  
	 
	 public static void main(String arg[]){
		 int[] arr={1,1,2};
		System.out.println(topKFrequent(arr, 1));
	 }
	
}
