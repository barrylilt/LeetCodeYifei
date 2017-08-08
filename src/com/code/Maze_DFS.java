/*490. The Maze
 * 
 * solution using DFS 
 * 
 */

package com.code;

public class Maze_DFS {

    public static boolean hasPath(int[][] maze, int[] start, int[] destination) {
         boolean[][] visited = new boolean[maze.length][maze[0].length];
        return dfs(maze, start, destination, visited);
    }
    
    public static boolean dfs(int[][] maze, int[] start, int[] destination, boolean[][] visited) {
        if (visited[start[0]][start[1]])
            return false;
        
        //if start position is at the destination 
        if (start[0] == destination[0] && start[1] == destination[1]) 
            return true;
        
        //set the start position as visited
        visited[start[0]][start[1]] = true;
        
        //defint 2d array indexes if move to the 4 directions
        int r = start[1] + 1, l = start[1] - 1, u = start[0] - 1, d = start[0] + 1;
        
        while (r < maze[0].length && maze[start[0]][r] == 0) // right
            r++;
        if (dfs(maze, new int[] {start[0], r - 1}, destination, visited)){
        	System.out.println( "right");
        	System.out.println( r-1);
        	
            return true;    
        }
        
        while (l >= 0 && maze[start[0]][l] == 0) //left
            l--;
        if (dfs(maze, new int[] {start[0], l + 1}, destination, visited)){
        	System.out.println( "left");
        	System.out.println(l+1);
        	 return true;
        }
           
        
        while (u >= 0 && maze[u][start[1]] == 0) //up
            u--;
        if (dfs(maze, new int[] {u + 1, start[1]}, destination, visited)){
        	System.out.println( "up");
        	System.out.println(u+1);
            return true;}
        
        while (d < maze.length && maze[d][start[1]] == 0) //down
            d++;
        if (dfs(maze, new int[] {d - 1, start[1]}, destination, visited)){
        	System.out.println( "down");
        	System.out.println(d-1);
            return true;}
        
        return false;
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
   	System.out.println(hasPath(maze, start, destination));
   }
}
