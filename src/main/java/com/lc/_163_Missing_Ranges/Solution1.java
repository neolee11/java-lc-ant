/**
 * Leetcode - _163_Missing_Ranges
 */
package com.lc._163_Missing_Ranges;

import java.util.*;

import com.ciaoshen.leetcode.util.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 *
 * =============================================
 */


class Solution1 implements Solution {

//    given [0, 1, 3, 50, 75], return ["2", "4->49", "51->74", "76->99"]
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();

        int l = lower;
        for (int i = 0; i < nums.length; i++) {
            int r = (i < nums.length && nums[i] <= upper) ? nums[i] : upper + 1;
            if (l == r) ++l;
            else if(r > l){
                res.add(r - l == 1 ? Integer.toString(l) : Integer.toString(l) + "->" + Integer.toString(r - l));
                l = r + 1;
            }
        }

        return res;
    }

}
