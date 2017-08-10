/* Yelp Interview : reduce a string 
 * 
 * for example 
 * from geeksforgeeks to geksforgeks
 * 
 * Two type of methods here
 */

package com.code;

public class Yelp_StringReduction {
   static String reduceString(String input){
	   int n=input.length();
	   String result="";
	   
	   char[] arr=input.toCharArray();
	   
	   
	   for(int i=0; i<n; i++){
		   if(arr[i]!='e'){
			   result=result+Character.toString(arr[i]);
			   
		   }
		   else{
			   result=result+" ";
		   }
	   }
	   
	   String newstring=result.trim().replaceAll(" +", "e");
	  
	   return newstring;
   }
   
   //method two 
   static String reduceStringTwo(String str){
   	int n=str.length();
   	 int uniqueindex=1;
   	 int index=1;
   	 
   	char[] arr=str.toCharArray();
   	
   	while(index!=n){
   		if(arr[index]!=arr[index-1]){
   			arr[uniqueindex]=arr[index];
   			uniqueindex+=1;
   		}
   		index+=1;
   	}
   	
   	str=new String(arr);
   	return str.substring(0,uniqueindex);
   }
   
   
   public static void main(String arg[]){
		
		System.out.println(reduceString("adfeeedecheer"));
		System.out.println(reduceStringTwo("adfeeedecheer"));
	 }
}

