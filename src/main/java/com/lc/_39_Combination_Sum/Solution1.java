/**
 * Leetcode - _39_Combination_Sum
 */
package com.lc._39_Combination_Sum;
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

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> currRes = new ArrayList<>();
        dfs(res, currRes, candidates, target, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> currRes, int[] candidates, int target, int level){
        if(target == 0){
            res.add(new ArrayList<>(currRes));
        }

        for(int i = level; i < candidates.length && (target - candidates[i] >= 0); i++){
            currRes.add(candidates[i]);
            dfs(res, currRes, candidates, target - candidates[i], i);
            currRes.remove(currRes.size() - 1);
        }
    }

}
