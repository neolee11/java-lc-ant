/**
 * Leetcode - _49_Group_Anagrams
 */
package com.lc._49_Group_Anagrams;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<List<String>> groupAnagrams(String[] strs);
}
