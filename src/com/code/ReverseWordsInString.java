/*Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
*/

package com.code;

public class ReverseWordsInString {
	 public static String reverseWords(String s) {
	        String[] parts = s.trim().split("\\s+");
	        String out = "";
	        
	        for (int i = parts.length - 1; i > 0; i--) {
	            out += parts[i] + " ";
	        }
	        
	        return out + parts[0];
	    }
	 
	 public static void main(String arg[]){
			System.out.println(reverseWords("the sky is blue"));
		 } 
}
