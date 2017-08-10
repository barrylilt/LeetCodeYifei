
/* 242. Valid Anagram
 * s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false
 */
package com.code;

import java.util.Arrays;

public class AnagramCheck {
	public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        

        char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();
        
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        
        return Arrays.equals(sarr, tarr);
    }
}
