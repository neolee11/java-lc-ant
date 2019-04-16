/**
 * Leetcode - _198_House_Robber
 */
package com.lc._198_House_Robber;
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

    private int[] dp;

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return rob_topdown(nums, nums.length - 1);
    }

    private int rob_topdown(int[] nums, int n){

        if(n < 0) return 0;
        if(n == 0) return nums[0];

        if(dp[n] != -1) return dp[n];

        int best = Math.max(rob_topdown(nums, n - 2) + nums[n], rob_topdown(nums, n-1));
        dp[n] = best;
        return best;

    }

}
