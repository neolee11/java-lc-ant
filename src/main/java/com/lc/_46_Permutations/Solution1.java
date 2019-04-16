/**
 * Leetcode - _46_Permutations
 */
package com.lc._46_Permutations;
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

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> currRes = new ArrayList();
        dfs(res, currRes, nums,0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> currRes, int[] nums){

        if(currRes.size() == nums.length) {
            res.add(new ArrayList<>(currRes));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(currRes.indexOf(nums[i]) >= 0) continue;
            currRes.add(nums[i]);
            dfs(res, currRes, nums);
            currRes.remove(currRes.size() - 1);
        }
    }

}
