/**
 * Leetcode - _5_Longest_Palindromic_Substring
 */
package com.lc._5_Longest_Palindromic_Substring;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    public String longestPalindrome(String s) {

        if(s.length() == 0) return "";

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int left = 0, right = 0, len = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                dp[j][i] = s.charAt(j) == s.charAt(i) && (i - j < 2 || dp[j+1][i-1]);
                if(dp[j][i] && len < i - j + 1){
                    len = i - j + 1;
                    left = j;
                    right = i;
                }
            }
            dp[i][i] = true;
        }

        return s.substring(left, right + 1);
    }

}
