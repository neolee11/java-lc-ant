/**
 * Leetcode - _53_Maximum_Subarray
 */
package com.lc._53_Maximum_Subarray;
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

    public int maxSubArray(int[] nums){
        int currSum = 0;
        int res = Integer.MIN_VALUE;

        for(int i = 0; i< nums.length; i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            res = Math.max(res, currSum);
        }

        return res;

    }

}
