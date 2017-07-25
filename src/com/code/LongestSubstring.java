package com.code;

import java.util.HashMap;
import java.util.Stack;

public class LongestSubstring {

	 static int lengthOfLongestSubstring(String s) {
		 
	        if(s!=null){
	        Stack<Integer> st = new Stack<Integer>();
	       
	        
	       for (int j=0; j<s.length(); j++){
	          
	            String curr="";
	                       
	             for(int i=j; i<s.length(); i++){
	              if(curr.indexOf(s.charAt(i))<0)  curr =curr+s.charAt(i);
	               else break;                  
	             }
	         
	              if(st.isEmpty()) {
	                  st.push(curr.length());
	              }
	              else if((!st.isEmpty()) && (st.peek()<curr.length())){
	                
	                     st.push(curr.length());
	                     curr="";
	                 } 
	                 
	       }
	       
	    
	      if(!st.isEmpty()) return st.peek();  
	      else 
	          return 0;
	        }
	        else 
	            return 0;
	    }
	 
	
	 
	 public static void main(String args[])
	    {
	    String s="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    System.out.print(lengthOfLongestSubstring(s));
	    }
}
