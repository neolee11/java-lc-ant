/**
 * Leetcode - _3_Longest_Substring_Without_Repeating_Characters
 */
package com.lc._3_Longest_Substring_Without_Repeating_Characters;

import java.util.*;

import com.ciaoshen.leetcode.util.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution1 implements Solution {

    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int currMax = 0;
        HashSet<Character> h = new HashSet<Character>();

        for(int i = 0, j = 0; i < s.length(); i++){
            while(j < s.length()){
                char currChar = s.charAt(j);
                if(h.contains(currChar)){
                    h.remove(s.charAt(i));
                    currMax--;
                    break;
                }
                else {
                    h.add(currChar);
                    currMax++;
                    if(currMax > max) max = currMax;
                    j++;
                }
            }
        }

        return max;
    }

}
