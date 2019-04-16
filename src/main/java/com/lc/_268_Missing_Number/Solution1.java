/**
 * Leetcode - _268_Missing_Number
 */
package com.lc._268_Missing_Number;
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

    public int missingNumber(int[] nums) {

        for(int i = 0; i < nums.length; i++){

            while(nums[i] != i && nums[i] < nums.length){
                int tmp = nums[i];
                nums[i] = nums[nums[i]];
                nums[tmp] = tmp;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i) return i;
        }

        return nums.length + 1;

    }

}
