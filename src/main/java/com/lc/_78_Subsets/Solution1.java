/**
 * Leetcode - _78_Subsets
 */
package com.lc._78_Subsets;
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

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> tmpSet = new ArrayList<Integer>();
        helper(res, tmpSet, nums, 0);

        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> tmpSet, int[] nums, int start){
        res.add(new ArrayList<>(tmpSet));

        for(int i = start; i < nums.length; i++){
            tmpSet.add(nums[i]);
            helper(res, tmpSet, nums, i + 1);
            tmpSet.remove(tmpSet.size() - 1);
        }
    }

}
