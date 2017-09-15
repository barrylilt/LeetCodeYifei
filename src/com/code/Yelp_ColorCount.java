package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Yelp_ColorCount {

	public static List<String> countColor(List<List<String>> input){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		for(List<String> row: input){
			for(String color: row){
				if(!map.containsKey(color)){
					map.put(color, 1);
				}
				else{
					map.put(color, map.get(color)+1);
				}
			}
		}
			
			List<Integer> count=new ArrayList<>();
			
			for(Map.Entry<String, Integer> entry: map.entrySet()){
				count.add(entry.getValue());		
			}
			
			Collections.sort(count);
			
			Integer max=count.get(count.size()-1);
			
			List<String> colorlist=new ArrayList<>();
			
			for(Map.Entry<String, Integer> entry: map.entrySet()){
				if(entry.getValue()==max)	{
					colorlist.add(entry.getKey());
				}
			}
			
			return colorlist;
			
		}
	
	public static void main(String arg[]){
		List<List<String>> input=new ArrayList<List<String>>();
		
		List<String> list1 = Arrays.asList("green", "red", "yellow");
		List<String> list2=Arrays.asList("yellow", "red", "green");
		List<String> list3=Arrays.asList("black", "yellow", "red");
		List<String> list4=Arrays.asList("yellow", "red", "green");
		
		input.add(list1);
		input.add(list2);
		input.add(list3);
		input.add(list4);
		
		System.out.println(countColor(input));
		                          
	}
}
