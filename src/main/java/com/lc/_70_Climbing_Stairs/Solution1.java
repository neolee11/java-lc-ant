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
 Top down DP (with memoization)

 int[][] dp = new int[n+1][m+1];//dp array
 int recursion_func(arr[], i, j){
    //base condition
    //return dp lookup if set

    int best = dp_recurrence_function (recursion_func(...))
    dp[i][j] = best;
    return best;
 }
 */
class Solution1 implements Solution {

    int[] dp;
    public int climbStairs(int n) {

        dp = new int[n + 1];

        // top down
        return claimStairs_topdown(n);
    }

    private int claimStairs_topdown(int n)
    {
        //base condition and looup with dp
        if(n < 0) return 0;
        if(n == 0) return 1;
        if(dp[n] > 0) return dp[n];

        int curr = claimStairs_topdown(n - 1) + claimStairs_topdown(n - 2);
        dp[n] = curr;
        return curr;
    }



}
