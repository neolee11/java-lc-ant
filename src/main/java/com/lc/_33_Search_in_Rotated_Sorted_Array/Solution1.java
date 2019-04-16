/**
 * Leetcode - _33_Search_in_Rotated_Sorted_Array
 */
package com.lc._33_Search_in_Rotated_Sorted_Array;
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

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid;

        while(low <= high){
            mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;

            if(nums[low] <= nums[mid]){
                //lower half is sorted
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else {
                //upper half is sorted
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

}
