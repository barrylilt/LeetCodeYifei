package com.code;

public class ExpediaInterview_SplitURL {

	public static String splitURL(String input){
		
		
		String result="";
		String[] arr1=input.split("://");
		
		String protocol=arr1[0];

        result=result+protocol+" ";
		
		String[] arr2=(arr1[1]).split("/");
		
		String domain=arr2[0];
		
		result=result+domain+" ";
				
		String[] arr3=arr2[arr2.length-1].split("\\?");
		
		
		if(arr3.length>1){
		String query=arr3[arr3.length-1];
		result=result+query;
		}
		
		return result;
	}
	
	public static void main(String arg[]){
		String input ="https://en.wikipedia.org/wiki/URL?45fjeigl";
		
		System.out.println(splitURL(input));
	}
}
