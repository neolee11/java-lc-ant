/**
 * Leetcode - _33_Search_in_Rotated_Sorted_Array
 */
package com.lc._33_Search_in_Rotated_Sorted_Array;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int search(int[] nums, int target);
}
