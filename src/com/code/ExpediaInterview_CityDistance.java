/*Given a line which has city and distance values, sort the cities based on the distance
 * 
 */
package com.code;

import java.util.Arrays;


public class ExpediaInterview_CityDistance {
	public static String[][] measureDistance(String input){
						
		String[] citylist=input.split(";");
		String[][] citydislist=new String[citylist.length][2];
		
		int n=0;
		
		for(String city: citylist){
			String[] sublist=city.split(",");
			citydislist[n][0]=sublist[0];
			citydislist[n][1]=sublist[1];
			n=n+1;
		}
		Arrays.sort(citydislist, (String[] s1, String[] s2) -> s1[1].compareTo(s2[1]));

		
		
		return citydislist;
	}
	
	public static void main(String arg[]){
		String input="San Jose,153;Shanghai,357;Cupertino,456;Milpitas,876";
		
		String[][] result=measureDistance(input);
		
		for(String[] eachresult: result ){
			System.out.println(Arrays.toString(eachresult));
		}
		
	}
}
