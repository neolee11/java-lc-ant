/**
 * Leetcode - _76_Minimum_Window_Substring
 */
package com.lc._76_Minimum_Window_Substring;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    String minWindow(String s, String t);
}
