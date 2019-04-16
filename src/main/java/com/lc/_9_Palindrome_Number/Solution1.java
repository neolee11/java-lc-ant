/**
 * Leetcode - _9_Palindrome_Number
 */
package com.lc._9_Palindrome_Number;
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

    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reservedNum = 0;
        int orig = x;
        while(x > 0){
            int lastDig = x % 10;
            x = x / 10;
            reservedNum = reservedNum * 10 + lastDig;
        }

        return orig == reservedNum;
    }

}
