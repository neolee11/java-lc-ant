/**
 * Leetcode - _121_Best_Time_To_Buy_And_Sell_Stock
 */
package com.lc._121_Best_Time_To_Buy_And_Sell_Stock;
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

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;

        for(int price: prices){
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }

        return profit;
    }

}
