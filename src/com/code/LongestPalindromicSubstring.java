package com.code;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Stack;

public class LongestPalindromicSubstring {

	 public static String longestPalindrome(String s) {
	       
	        ArrayList<String> list = new ArrayList<String>();
	        
	        int n=s.length();
	        
	        for(int i=0; i<n; i++){
	            for(int j=i+1; j<n+1; j++){
	                String str="";
	               if(i!=j)  str=s.substring(i, j);
	              
	               else if(i==j)  str=Character.toString(s.charAt(i)) ;
	              
	               
	                list.add(str);
	            }
	        }
	        
	        Stack<String> st = new Stack<String>();
	        
	        for(String str:list){
	            
	           if( check(str)==1){
	                              
	                if(st.isEmpty()) st.push(str);
	                if(!st.isEmpty() && st.peek().length()<str.length()) {
	                	
	                	st.push(str);  }             
	                }
	            
	           } 
	           
	        
	        
	        return st.peek();
	            
	    }
	 
	 static int check(String s){
		 if(s.length()==1) return 1;
		 
		 else{
		 for(int i=0; i<s.length()/2; i++){
             if(s.charAt(i)!=s.charAt(s.length()-i-1)) return -1;
         }
			return 1;
		 }
		}
	 
	 public static void main(String args[])
	    {
	    String s="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
	    System.out.println(longestPalindrome(s));
	    }
	 
	 
}
