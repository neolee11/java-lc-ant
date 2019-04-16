/**
 * Leetcode - _70_Climbing_Stairs
 */
package com.lc._70_Climbing_Stairs;
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

/**
 * DP bottom up (no recursion)

    int dp_function(int n){
        int[] dp = new int[n+1];
        // do some initlization base on states or requirements
        for(int i = 1 to n){
            dp[i] = dp[i] + dp[j] //some previous lookup
            dp[i] = best(dp[i], dp_recurrence_function);
        }

        return dp[n];
    }
 */
class Solution2 implements Solution {

    //bottom up
    public int climbStairs(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }


}
