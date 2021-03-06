/**
 * Leetcode - _221_Maximal_Square
 */
package com.lc._221_Maximal_Square;
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

    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[][] dp = new int[rows + 1][cols + 1];

        int maxsqlen = 0;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i][j-1]), dp[i-1][j]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
                else{
                    dp[i][j] = 0; //already init to 0
                }
            }
        }

        return maxsqlen * maxsqlen;
    }

}
