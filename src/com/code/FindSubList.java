/*Atlassin HackerRank Test Question 
 * 
 * Implement a method "find" that will find the starting index(zero  based) 
 * where the second list occurs as a sub-list in the first list. It should 
 * return -1 if the sub-list cannot be found. Arguments are always given, not empty. 
 * 
 * Sample input:
 * list1=(1,2,3)
 * list2=(2,3)  
 * 
 * Sample Output:
 * 1
 * 
 */

package com.code;

public class FindSubList {
	 static int find(int arr1[], int arr2[], int m, int n)
	    {
	        
	        int index=0;
	        int check=0;
	        
	            for (int j = 0; j<m; j++)
	            {
	               if(arr2[0] == arr1[j])  index=j;
	            	   
	            } 
	            	  if(index+n>=m) return -1;
	            	  else {
	            	for (int i=1; i<n; i++){
	            		   if(arr2[i]!=arr1[index+i]) check+=1;
	            		   if(index+i>=m) check+=1;
	            		   
	            	   }
	              	            	   	              	                           	          	              	           	        
	       if(check==0) return index;
	       else return -1;
	            	  }
	    }
	      
	    public static void main(String args[])
	    {
	        int arr1[] = {1,2,3,4,5};
	        int arr2[] = {2,3,4};
	        
	        int m = arr1.length;
	        int n = arr2.length;
	      
	        
	          System.out.print("The result is " + find(arr1, arr2, m, n));
	        	          
	    }
	}

