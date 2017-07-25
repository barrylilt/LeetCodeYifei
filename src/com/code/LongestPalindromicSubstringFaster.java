/* 
 Given a string s, find the longest palindromic substring in s
 Input: "babad"
 Output: "bab"
 
 Input: "cbbd"
 Output: "bb"
 * */
 
package com.code;

public class LongestPalindromicSubstringFaster {

	static String longestPalindrome(String s) {
		 int n = s.length(); 
		 
		    // table[i][j] will be 1 if substring(i,j) ispalindrome, else -1
		    int[][] table=new int[n][n];
		 
		    // All substrings of length 1 are palindromes
		    int maxLength = 1;
		    for (int i = 0; i < n; ++i)
		        table[i][i] =1;
		 
		    // check for sub-string of length 2.
		    int start = 0;
		    for (int i = 0; i < n-1; ++i)
		    {
		        if (s.charAt(i) == s.charAt(i+1))
		        {
		            table[i][i+1] = 1;
		            start = i;
		            maxLength = 2;
		        }
		    }
		 
		    // Check for lengths greater than 2. k is length of substring
		    for (int k = 3; k <= n; k++)
		    {
		        // Fix the starting index
		        for (int i = 0; i < n-k+1 ; i++)
		        {
		            // Get the ending index of substring from
		            // starting index i and length k
		            int j = i + k - 1;
		 
		            // checking for sub-string from ith index to
		            // jth index if s[i+1] to s[j-1] is a palindrome
		            
		            if ( table[i+1][j-1]==1 && s.charAt(i) == s.charAt(j))
		            {
		                table[i][j] = 1;
		 
		                if (k > maxLength)
		                {
		                    start = i;
		                    maxLength = k;
		                }
		            }
		        }
		    }
		   //get the final string     
		  String result="";
		    
		    for( int i = start; i <= (start + maxLength - 1) ; i++ )
		        result=result+s.charAt(i);
		     
		    return result;
		   
				}         
	    	    
	     public static void main(String args[])
		    {
		    String s="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		    System.out.println(longestPalindrome(s));
		    }
}
