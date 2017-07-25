package com.code;

import java.util.ArrayList;

public class PalindromeNumber {
static boolean isPalindrome(int x) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    if(x<0) return false;
               
     while(x!=0){
         Integer tail=x % 10;
         list.add(tail);
         x=x/10;
         
     }
     
     if(list.size()==1) return true;
		else if (list.size()==2){
         if( list.get(0)==list.get(1)) return true;
         else return false;
     }  
     
		 else{
		 for(int i=0; i<list.size()/2; i++){
          if(list.get(i)!=list.get(list.size()-i-1)) return false;
      }
			return true;
		 }
 
}

public static void main(int x){
	
	System.out.println(isPalindrome(323));
}
}