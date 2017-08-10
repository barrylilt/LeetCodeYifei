/* Yelp Interview Question 
 * 
 * Remove Duplicate characters from String 
 * 
 * This method uses Hasing( LinkedHashSet) 
 */


package com.code;


import java.util.LinkedHashSet;



public class RemoveDuplicates_InString {
	 /* Function removes duplicate characters from the string
    This function work in-place */
    public void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
         
        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);
    }
    
    
     
    /* Driver program to test removeDuplicates */
    public static void main(String args[]){
    
        String str = "geeksforgeeks";
        RemoveDuplicates_InString r = new RemoveDuplicates_InString();
        r.removeDuplicates(str);
       
    }

}
