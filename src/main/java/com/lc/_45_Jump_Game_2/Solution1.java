/**
 * Leetcode - _45_Jump_Game_2
 */
package com.lc._45_Jump_Game_2;
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

    public int jump(int[] nums) {

        if(nums.length < 2) return 0;

        int[] minJumps = new int[nums.length];
        Arrays.fill(minJumps, Integer.MAX_VALUE);

        minJumps[0] = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j <= nums[i]; j++){
                if(i+j < nums.length){
                    minJumps[i+j] = Math.min(minJumps[i+j], minJumps[i] + 1);
                }
            }
        }

        return minJumps[minJumps.length - 1];
    }

}
