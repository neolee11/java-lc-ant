/**
 * Leetcode - _100_Same_Tree
 */
package com.lc._100_Same_Tree;

import java.util.*;

import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isSameTree(TreeNode p, TreeNode q);
}
