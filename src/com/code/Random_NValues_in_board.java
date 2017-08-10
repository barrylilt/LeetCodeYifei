/*Yelp Interview Question
 * 
 * Given the length and width of a board, also given a number n. 
 * To generate a board that randomly contains n mines in this board.  
 * 
 */

package com.code;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Random_NValues_in_board {

	public static int[][] randomeBoard(int length, int width, int n){
		
		int[][] board=new int[length][width];
		
		LinkedHashSet<int[]> list=new LinkedHashSet<>();
		
		for(int i=0; i<n; i++){
			int x = (int )(Math.random() *(length-1)  + 0);
			int y = (int )(Math.random() *(width-1)  + 0);
			
		if(!list.contains(new int[]{x,y}))
			board[x][y]=1;
		    list.add(new int[]{x,y});
		}
		
		return board;
	}
	
	public static void main(String arg[]){
		int[][] board=randomeBoard(3,4,2);
		for(int[] row: board){
			System.out.println(Arrays.toString(row));
		}
	}
}
