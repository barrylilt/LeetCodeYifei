/* Atlassin HackerRank Test Question 
 * 
 * 
 * Given two integers, l and r, 
 * print all the odd numbers betweel l and r( l and r inclusive)
 * The function must return an array of integers denoting the odd 
 * numbers between l and r. 
 * */

package com.code;

public class OddNumbers {

	static int[] returnOddNumbers(int l, int r) {

		  int[] arr=new int[r-l+1];
		        int size=r-l+1;
		        int count=0;
		        
		        for(int i=0; i<size; i++){
		            int number=l+i;
		            if(number%2!=0) {
		                arr[count]=number;
		                count+=1;
		            }
		                
		        }
		        
		       int[] newArr=new int[count];
		        
		       for(int j=0; j<arr.length; j++){
		           if(arr[j]!=0) newArr[j]=arr[j];
		       }
		        
		      return newArr;
		    }
public static void main(String arg[]){
	int[] arr=returnOddNumbers(4, 9);
	
	for(int i=0; i<arr.length; i++)
	System.out.println(arr[i]);
}
}
