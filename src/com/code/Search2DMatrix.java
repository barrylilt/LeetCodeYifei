package com.code;

public class Search2DMatrix {
public static boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix==null || matrix.length==0){
            return false;
        }
        
        int n=matrix.length;
        
        if(matrix[0]==null|| matrix[0].length==0){
            return false;
        }
        
        int m=matrix[0].length;
        int start=0, end=n*m-1;
        
        while(start+1<end){
            int mid=start+(end-start)/2;
            int row=mid/m;
            int col = mid % m;
            if(matrix[row][col]<target){
                start=mid;
            }
            
            else{
                end=mid;
            }
        }
        
        if(matrix[start/m][start%m]==target){
            return true;
        }
        
        if(matrix[end/m][end%m]==target){
            return true;
        }
        
        return false;
    }

public static void main(String arg[]){
	int[][] matrix={
			{1,3,5,7},
			{10,11,16,20},
			{23,30,34,50}
			};
	
	int target=3;
	
	System.out.println(searchMatrix(matrix, target));
	}
}
	

