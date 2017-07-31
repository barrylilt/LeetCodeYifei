/* Leetcode #14
 * Write a function to find the longest common prefix string 
 * amongst an array of strings.
 * Input  : {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
 * Output : "gee"
 * still need to work on binary search solution 
 */

package com.code;

public class LongestCommonPrefix {
	 static String longestCommonPrefix(String[] strs) {
	        if(strs==null || strs.length==0){
	        return "";
	    }
	 
	    if(strs.length==1) 
	        return strs[0];
	 //get the string which is the shortest 
	    int minLen = strs.length+1;
	 
	    for(String str: strs){
	        if(minLen > str.length()){
	            minLen = str.length();
	        }
	    }
	 
	    //binary search
	    for(int i=0; i<minLen; i++){
	        for(int j=0; j<strs.length-1; j++){
	            String s1 = strs[j];
	            String s2 = strs[j+1];
	            if(s1.charAt(i)!=s2.charAt(i)){
	                return s1.substring(0, i);
	            }
	        }
	    }
	 
	    return strs[0].substring(0, minLen);
	}
	 
	 public static void main(String arg[]){
		 String[] arr={"geeksforgeeks", "geeks", "geek", "geezer"};
		System.out.println(longestCommonPrefix(arr));
	 } 
}
