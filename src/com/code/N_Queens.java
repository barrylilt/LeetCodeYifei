/*51. N-Queens
 * 
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard 
 * such that no two queens attack each other.
 */

package com.code;

import java.awt.List;
import java.util.ArrayList;

public class N_Queens {

    static int[] result; // this array will store the position of queen in each row 
    static ArrayList<ArrayList<String>> list; //this list of store the final result
    
    public static ArrayList<ArrayList<String>> solveNQueens(int n) {
        
        result = new int[n];
        list=new ArrayList<>();
        
        N_Queens s = new N_Queens();
		s.placeQueens(0, n);
       
        return list;
    }
         
    public void placeQueens(int x, int size) {
        ArrayList<String> sublist=new ArrayList<>();
        
		for (int i = 0; i < size; i++) {
            
			//check if queen at xth row can be placed at i-th column.
			if (canPlace(x, i)) {
                 
				result[x] = i; // place the queen at this position.
              
                if(x==size-1){
                                     
                    for(int k=0; k<size; k++){
                         String str="";
                        for(int j=0; j<size; j++){
                           if(j!=result[k]) str=str+".";
                           else if(j==result[k]) str=str+"Q";
                        }
                        sublist.add(str);                        
                    }
                    list.add(sublist);
                    //System.out.println(sublist);                                       
                    //System.out.println("Order of " + size + " queens"+ Arrays.toString(result));                                       
                }
                
                placeQueens( x + 1, size);
			}
		}       
	} 
    
     public boolean canPlace(int x, int y){
        for(int i=0; i<x; i++){
            if ((result[i] == y) || (Math.abs(i - x) == Math.abs(result[i] - y))){
                return false;
            }                
        }
        return true;
    }
     
     public static void main(String arg[]){
    	 int n=6;
    	System.out.println(solveNQueens(n));
    }
}
