package com.code;

import java.util.Arrays;

public class Maze_Distance_DFS {
	 public static int shortestDistance(int[][] maze, int[] start, int[] dest) {
	        //2d array of each cell's distance from the start cell
	        int[][] distance = new int[maze.length][maze[0].length];
	        int[][] newmaze = new int[maze.length][maze[0].length];
	        
	        //add values to distance array, each elemet is Java Max_Value
	        for (int[] row: distance)
	            Arrays.fill(row, Integer.MAX_VALUE);
	        
	        //distance of starting point is 0
	        distance[start[0]][start[1]] = 0;
	        
	        //backtracking dfs 
	        dfs(maze, start, distance, newmaze);
	        
	        for(int[] arr: distance)  {
	  		  System.out.println(Arrays.toString(arr));
	  	  }
	        return distance[dest[0]][dest[1]] == Integer.MAX_VALUE ? -1 : distance[dest[0]][dest[1]];
	  
	       
	 }

	    public static void dfs(int[][] maze, int[] start, int[][] distance, int[][] newmaze) {
	        //array of the 4 directions 
	        int[][] dirs={{0,1}, {0,-1}, {-1,0}, {1,0}};
	       
	        //calculate the distance of the furtherest cell in each direction
	        for (int[] dir: dirs) {
	            int x = start[0] + dir[0];
	            int y = start[1] + dir[1];
	            int count = 0;
	            while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 0) {
	                x += dir[0];
	                y += dir[1];
	                count++;
	            }
	            if (distance[start[0]][start[1]] + count < distance[x - dir[0]][y - dir[1]]) {
	                distance[x - dir[0]][y - dir[1]] = distance[start[0]][start[1]] + count;
	                newmaze[x - dir[0]][y - dir[1]] = 2;
	                dfs(maze, new int[]{x - dir[0],y - dir[1]}, distance, newmaze);
	            }
	        }
	    }
	    
	    public static void main(String arg[]){
		   	 int[][] maze={
		   			 {0,0,1,0,0},
		   			 {0,0,0,0,0},
		   			 {0,0,0,1,0},
		   			 {1,1,0,1,1},
		   			 {0,0,0,0,0}
		   	 };
		   	 
		   	 int[] start={0,4};
		   	 int[] destination={4,4};
		   	System.out.println(shortestDistance(maze, start, destination));
		   }
}
