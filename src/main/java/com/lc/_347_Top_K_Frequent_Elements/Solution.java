/**
 * Leetcode - _347_Top_K_Frequent_Elements
 */
package com.lc._347_Top_K_Frequent_Elements;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Integer> topKFrequent(int[] nums, int k);
}
