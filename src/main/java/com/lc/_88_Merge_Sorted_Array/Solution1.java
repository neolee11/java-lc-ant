/**
 * Leetcode - _88_Merge_Sorted_Array
 */
package com.lc._88_Merge_Sorted_Array;

import java.util.*;

import com.ciaoshen.leetcode.util.*;
import com.lc.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution1 implements Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1, j = n-1;
        int next = m + n - 1;

        while (i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]){
                nums1[next--] = nums1[i--];
            }
            else {
                nums1[next--] = nums2[j--];
            }
        }

        while(j >= 0) nums1[next--] = nums2[j--];

        System.out.println(myUtil.IntArrayToString(nums1));
    }

}
