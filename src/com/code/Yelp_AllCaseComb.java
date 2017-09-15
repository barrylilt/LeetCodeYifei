package com.code;

import java.util.HashSet;
import java.util.Set;

public class Yelp_AllCaseComb {
 public static void main(String[] arg){
	 String s="0ab";
	 
	 Set<String> combs = new HashSet<String>();
		if(s==null || s.length()==0) {
			System.out.println(combs);
		}
		combs.add(s);
		
		for(int i=0; i<s.length();i++) {
			Set<String> newcombs = new HashSet<String>();
			for(String comb: combs) {
				if(Character.isLowerCase(comb.charAt(i))) {
					newcombs.add(comb.substring(0,i)+Character.toUpperCase(comb.charAt(i))+comb.substring(i+1));
				}
			}
			combs.addAll(newcombs);
		}
		System.out.println(combs);
 }
}
