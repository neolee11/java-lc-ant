/**
 * Leetcode - _64_Minimum_Path_Sum
 */
package com.lc._64_Minimum_Path_Sum;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int minPathSum(int[][] grid);
}
