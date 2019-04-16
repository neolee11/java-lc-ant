/**
 * Leetcode - _17_Letter_Combinations_of_a_Phone_Number
 */
package com.lc._17_Letter_Combinations_of_a_Phone_Number;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    List<String> letterCombinations(String digits);
}
