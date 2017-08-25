package com.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RestaurantCategory {

	public static void main(String[] args){
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("American", "Burger,French Fries,Potato Chips");
		hm.put("Italian", "Pizza,Bread Sticks,Potato Chips");
		
		HashMap<String, ArrayList<String>> map=new HashMap<String, ArrayList<String>>();
		
	    for(Map.Entry<String, String> entry:hm.entrySet()){
	    	String restType=entry.getKey();
	    	
	    	String[] category=(entry.getValue()).split(",");
	    	
	    	for(String cat: category){
	    		if(!map.containsKey(cat)){
	    			ArrayList<String> list=new ArrayList<>();
	    			list.add(restType);
	    			
	    		map.put(cat, list);
	    		
	    		}
	    		
	    		if(map.containsKey(cat)){
	    			map.get(cat).add(restType);	    			
	    		}
	    	}
	    }
	    
	    System.out.println(map.get("Pizza"));
	    
	}
}
