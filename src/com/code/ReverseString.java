package com.code;

public class ReverseString {
	static String reverseString(String s) {
        
        String newString="";
        
        
        char[] arr = s.toCharArray();
 
        for (int i = arr.length-1; i>=0; i--)
           newString=newString+Character.toString(arr[i]);
        
        return newString;
    }
	
	 public static void main(String args[]){
		 String input="Geeks for Geeks.";
		 System.out.println(reverseString(input));
	 }
}
