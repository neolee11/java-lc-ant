/**
 * Leetcode - _206_Reverse_Linked_List
 */
package com.lc._206_Reverse_Linked_List;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode reverseList(ListNode head);
}
