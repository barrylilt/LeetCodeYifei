/*
 * You are given three coins of value 1,3,5, and also a given total which you have to arrive. F
 * Find the minimum number of coins to arrive at it. 
 */

package com.code;

public class ExpediaInterview_CoinsCount {

	public static int countCoins(int n){
		int count=n/5;
		
		int remain=n%5;
		
		int result=0;
		
		if(remain==0){
			result=count+n/5;
		}
		
		if(remain==1 || remain==3){
			result=count+1;
		}
		
		if(remain==2 || remain==4){
			result=count+2;
		}
		
		return result;
	}
	
	public static void main(String arg[]){
		System.out.println(countCoins(29));
	}
}
