package com.code;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagrams {
	 static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
		 if (strs == null || strs.length == 0) return new ArrayList<ArrayList<String>>();
	        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	        for (String s : strs) {
	            char[] ca = s.toCharArray();
	            Arrays.sort(ca);
	            String keyStr = String.valueOf(ca);
	            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
	            map.get(keyStr).add(s);
	        }
	        return new ArrayList<ArrayList<String>>(map.values());
	    }
	 public static void main(String arg[]){
			String[] arr={"eat", "tea", "tan", "ate", "nat", "bat"};
			System.out.println(groupAnagrams(arr));
		}

}
