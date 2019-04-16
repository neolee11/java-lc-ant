/**
 * Leetcode - _238_Product_Of_Array_Except_Self
 */
package com.lc._238_Product_Of_Array_Except_Self;
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

    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        int right = 1;
        res[0] = 1;
        for(int i = 1; i < nums.length; i++){
            res[i] = res[i-1] * nums[i - 1];
        }

        for(int i = nums.length - 1; i >= 0; i--){
            //update res
            res[i] = res[i] * right;

            //update right
            right *= nums[i];
        }

        return res;
    }

}
