/**
 * Leetcode - _25_Reverse_Nodes_in_k-Group
 */
package com.lc._25_Reverse_Nodes_in_k-Group;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode reverseKGroup(ListNode head, int k);
}
