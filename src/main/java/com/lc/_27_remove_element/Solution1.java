/**
 * Leetcode - _27_remove_element
 */
package com.lc._27_remove_element;
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

    public int removeElement(int[] nums, int val) {

        int  res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val) nums[res++] = nums[i];
        }

        return res;
    }

}
