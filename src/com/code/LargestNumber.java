package com.code;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public static String largestNumber(int[] nums) {
	Comparator<String> cmp = new Comparator<String>() {
	      public int compare(String s1, String s2) {
	        return (s2+s1).compareTo(s1+s2);
	         }
	      }; 
	        
	          String[] strs = new String[nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            strs[i] = Integer.toString(nums[i]);
	        }
	        Arrays.sort(strs, cmp);
	        
	        System.out.println(Arrays.toString(strs));
	        
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < strs.length; i++) {
	            sb.append(strs[i]);
	        }
	        String result = sb.toString();
	        int index = 0;
	        while (index < result.length() && result.charAt(index) == '0') {
	            index++;
	        }
	        if (index == result.length()) {
	            return "0";
	        }
	        return result;
}
	
	public static void main(String arg[]){
		int[] arr={3, 30, 34, 5,9};
		System.out.println(largestNumber(arr));
	}
}
