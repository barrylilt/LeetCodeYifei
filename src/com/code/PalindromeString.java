package com.code;

public class PalindromeString {

	static boolean isPalindrome(String s) {
		
		char[] arr=s.toCharArray();
		int n=arr.length;
	   	    
	     if(n==0) return false;
	               	     
	     if(n ==1) return true;
		
	     else if (n==2){
	         if( arr[0]==arr[1]) return true;
	         else return false;
	     }  
	     
		else{
			 for(int i=0; i<n/2; i++){
	          if(arr[i]!=arr[n-i-1]) return false;
	      }
				return true;
		}
	 
	}

	public static void main(String arg[]){
		
		System.out.println(isPalindrome("acbca"));
	}
}
