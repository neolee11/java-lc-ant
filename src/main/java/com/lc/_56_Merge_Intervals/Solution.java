/**
 * Leetcode - _56_Merge_Intervals
 */
package com.lc._56_Merge_Intervals;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Interval> merge(List<Interval> intervals);
}
