package com.code;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	 static void removeDuplicates(Integer[] arr){
		 LinkedHashSet<Integer> list=new LinkedHashSet<>();
		 
		 for(int i=0; i<arr.length; i++){
			 list.add(arr[i]);
			 
		 }
		 
		 for (Integer str:list)
			 System.out.println(str);
	 }
	 
	 public static void main(String arg[]){
		 Integer[] arr={1,1,2,4};
		 removeDuplicates(arr);
	 }
}
