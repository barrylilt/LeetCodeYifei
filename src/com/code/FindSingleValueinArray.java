/*Atlassin HackerRank Test Question 
 * 
 * Given an unsorted array of n elements, find if the element k is present 
 * in the array or not
 * 
 */

package com.code;

public class FindSingleValueinArray {

	static int findValue(int arr[], int m){
		for (int i=0; i<arr.length; i++){
			if (arr[i]==m) return i;
		}
		return -1;
	}
	
	 public static void main(String args[])
	    {
	        int arr[] = {11, 1, 13, 21, 3, 7};
	        int m=4;
	        	        
	       
	          System.out.print(findValue(arr, m));
	        
	    }
}
