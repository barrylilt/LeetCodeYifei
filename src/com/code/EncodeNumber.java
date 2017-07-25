/* Atlassian HackerRank Online Test question
 * 
 * Complete the function that takes an integer as its argument and 
 * returns sthe encoded string in base 7 using the following encoding rule
 * 
 * base 10 0 1 2 3 4 5 6
 * base 7 0 1 t l s i N
 * 
 * Input: 7
 * output: a0
 * 
 */

package com.code;

public class EncodeNumber {
	public static void main(String args[] ) throws Exception {
        
        char[] b7={'0','a','t','l','s','i','n'};
        int[] arr={7, 9};
        
        StringBuffer sb=new StringBuffer();
        
        for(int j=0; j<arr.length; j++){
        	int i=arr[j]; 
        while(i>0){
            int n=i%7;
            sb.append(b7[n]);
            i=i/7;
        }
        }
        System.out.println(sb.reverse());
       
    }

}
