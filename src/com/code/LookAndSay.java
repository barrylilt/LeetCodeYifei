/*Atlassin HackerRank Test Question 
 * 
 * Let's define a function "LookAndSay" as follow: read off the digits of
 * the input, counting the number of digits in group of same digit. 
 * LookAndSay(1) =11, reads as "one 1"
 * LookAndSay(11)=21, reads as "two 1s"
 * LookAndSay(1211)=111221, reads as "one 1, one 2, two 1"

 * We then define a "Look and Say" sequence as repeatedly called the 
 * "look and Say" function on its output
 * Given a number start and a number of iteration n, calculate the nth 
 * number in a "Look and Say" Sequence starting with start. 
 * 
 * Reusing the previous example with start=11 and n=2, LookAndSay(11,2)=1211 
 * because LookAndSay(LookAndSay(11))=LookAndSay(21)=1211
 * 
 * Since the sequence grows quickly we will use a string representation 
 * for the number in the sequence to avoid number overflow. 
 * 
 */

package com.code;
	
public class LookAndSay {
	   

	static String lookAndSay(int start, int n) {

	String result = Integer.toString(start);
	if(n <1)
			return result;
		int i = 1;

	 
		while (i <=n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}
	 
			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}
	 
		return result;
	}

public static void main(String args[] ) throws Exception {
    
	int start = 11;
	int n = 2;
	System.out.println(lookAndSay(start,n));

    }
	}




