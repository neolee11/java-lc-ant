/**
 * Leetcode - _121_Best_Time_To_Buy_And_Sell_Stock
 */
package com.lc._121_Best_Time_To_Buy_And_Sell_Stock;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int maxProfit(int[] prices);
}
