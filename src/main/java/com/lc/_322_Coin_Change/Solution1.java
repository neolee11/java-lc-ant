/**
 * Leetcode - _322_Coin_Change
 */
package com.lc._322_Coin_Change;
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

    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        for(int coin: coins){
            if(coin <= amount) dp[coin] = 1;
        }

        for(int i = 1; i <= amount; i++){
            for(int coin: coins){
                if(coin > i) continue;
                if(dp[i - coin] == -1) continue;
                if(dp[i] == -1 || dp[i] > dp[i - coin] + 1) dp[i] = dp[i - coin] + 1;
            }
        }

        return dp[amount];
    }

}
