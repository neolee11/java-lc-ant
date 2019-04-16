/**
 * Leetcode - _4_Median_of_Two_Sorted_Arrays
 */
package com.lc._4_Median_of_Two_Sorted_Arrays;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    double findMedianSortedArrays(int[] nums1, int[] nums2);
}
