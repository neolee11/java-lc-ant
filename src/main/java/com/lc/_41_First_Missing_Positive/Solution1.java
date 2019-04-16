/**
 * Leetcode - _41_First_Missing_Positive
 */
package com.lc._41_First_Missing_Positive;
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

    public int firstMissingPositive(int[] nums){
        for(int i = 0; i < nums.length; i++){
            while(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]){
                int tmp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[tmp - 1] = tmp;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1) return i+1;
        }

        return nums.length + 1;
    }

}
