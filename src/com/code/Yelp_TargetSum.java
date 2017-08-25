package com.code;

public class Yelp_TargetSum {
	public static int isScorePossible(int[] points, int value){
		int status [] =new int [value+1];
		status [0]=1;
		
		for (int i=0;i<points.length;++i){
			for (int j=points[i];j<=value;++j){
				status[j]+=status[j-points[i]];
			}
		}
		
		return status[value];
}
	
	public static void main(String[] arg){
		int[] points={3, 7};
		System.out.println(isScorePossible(points, 6));
	}
}
