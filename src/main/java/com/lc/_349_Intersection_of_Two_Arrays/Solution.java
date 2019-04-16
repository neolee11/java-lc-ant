/**
 * Leetcode - _349_Intersection_of_Two_Arrays
 */
package com.lc._349_Intersection_of_Two_Arrays;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] intersection(int[] nums1, int[] nums2);
}
