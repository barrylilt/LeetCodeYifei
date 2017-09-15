package com.code;

import java.util.HashMap;
import java.util.Map;

public class Yelp_DotProduct {

	public static int getDotProduct(int k, int n, int[][] vector1, int[][] vector2){
		 
	        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	        
	        int result = 0;

	        for(int i=0; i<k; i++) {
	            
	            int key = vector1[i][0];
	            int value = vector1[i][1];
	            map.put(key, value);
	        }

	        for(int i=0; i<n; i++) {
	        	  int key = vector2[i][0];
		            int value = vector2[i][1];
	            if(map.containsKey(key) && map.get(key)!=null) {
	                int tempvalue = map.get(key) * value;
	                result += tempvalue;
	            }
	        }

	       return result;
	}
	
	public static void main(String arg[]){
		int k=3;
		int n=3;
		int[][] vector1={{1,4},
				{4,2},
				{5,3}
		};
		
		int[][] vector2={{1,7},
				{2,6},
				{5,1}
		};
		
		System.out.println(getDotProduct(k,n, vector1, vector2));
	}
}
