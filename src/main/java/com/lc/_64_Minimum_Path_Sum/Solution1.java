/**
 * Leetcode - _64_Minimum_Path_Sum
 */
package com.lc._64_Minimum_Path_Sum;
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

    public int minPathSum(int[][] grid) {
        int rows = grid.length, cols = rows > 0 ? grid[0].length : 0;
        int[][] dp = new int[rows + 1][cols + 1];

        for(int i = 0; i < rows; i++){
            dp[i+1][1] = i == 0 ? grid[i][0] : grid[i][0] + grid[i-1][0];
        }

        for(int i = 0; i < cols; i++){
            dp[1][i+1] = i == 0 ? grid[0][i] : grid[0][i] + grid[0][i-1];
        }

        for(int i = 2; i <= rows; i++){
            for(int j = 2; j <= cols; j++){
                dp[i][j] = grid[i-1][j-1] + Math.min(dp[i][j-1], dp[i-1][j]);
            }
        }

        return dp[rows][cols];
    }

}
