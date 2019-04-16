/**
 * Leetcode - _62_Unique_Paths
 */
package com.lc._62_Unique_Paths;

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

    private int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return uniquePaths_TopDown(m, n);
    }

    public int uniquePaths_TopDown(int m, int n) {
        if (m == 0 || n == 0) return 1;
        if (m == 1) return 1;
        if (n == 1) return 1;

        if (dp[m - 1][n - 1] != -1) return dp[m - 1][n - 1];

        dp[m - 1][n - 1] = uniquePaths_TopDown(m - 1, n) + uniquePaths_TopDown(m, n - 1);
        return dp[m - 1][n - 1];
    }

}
