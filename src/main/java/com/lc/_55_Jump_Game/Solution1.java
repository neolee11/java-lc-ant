/**
 * Leetcode - _55_Jump_Game
 */
package com.lc._55_Jump_Game;
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

    public boolean canJump(int[] nums){

        int reach = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > reach) return false;
            reach = Math.max(reach, i + nums[i]);
        }

        return reach >= nums.length - 1;
    }

}
