package com.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Yelp_RestaurantRatingMedian {

	public void findRestaurantatingMedium(String[][] input) {
		int n=input.length;
		
		HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
		
		for(int i=0; i<n; i++){
			if(!map.containsKey(Integer.parseInt(input[i][0]))){
				ArrayList<String> list=new ArrayList<>();
				list.add(input[i][1]);
				map.put(Integer.parseInt(input[i][0]), list ); 
			}
			
			else{				
				map.get(input[i][0]).add(input[i][1]);
				
			}
			
		}
		
	ArrayList<Integer> rating=new ArrayList<>();
	
	for(Map.Entry<Integer, ArrayList<String>> entry: map.entrySet()){
		rating.add(entry.getKey());
	}
	
	int a=rating.size();
	
	if(a%2==0){		
		int median1=rating.get(a/2-1);
		int median2=rating.get(a/2);
		System.out.println("rating "+ median1 +" has restaurants:"+ map.get(median1) );
		System.out.println("rating "+ median2 +" has restaurants:"+ map.get(median2) );
		
	}
	
	if(a%2!=0){
		int median=rating.get(a/2);
		System.out.println("rating "+ median +" has restaurants:"+ map.get(median) );
	}
		
	}
	
	public static void main(String arg[]){
		String[][] input={{"4", "kfc"},
				{"3", "mcd"},
				{"2", "asianbox"},
				{"1", "blackpeal"}
		};
		
		Yelp_RestaurantRatingMedian s= new Yelp_RestaurantRatingMedian();
		s.findRestaurantatingMedium(input);
	}
}
