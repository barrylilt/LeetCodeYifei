package com.code;

import java.util.Arrays;

public class ValidAnagram {
	 public static boolean isAnagram(String s, String t) {
	        if(s.length()!=t.length()){
	            return false;
	        }
	        
	        char[] sarr=s.toCharArray();
	        char[] tarr=t.toCharArray();
	        
	        Arrays.sort(sarr);
	        Arrays.sort(tarr);
	        
	        return Arrays.equals(sarr, tarr);
	    }
	 
	 public static void main(String arg[]){
		System.out.println(isAnagram("sat", "ats"));
	 } 
}
