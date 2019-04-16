/**
 * Leetcode - _163_Missing_Ranges
 */
package com.lc._163_Missing_Ranges;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<String> findMissingRanges(int[] nums, int lower, int upper);
}
