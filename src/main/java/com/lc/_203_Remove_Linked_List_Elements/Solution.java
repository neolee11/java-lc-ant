/**
 * Leetcode - _203_Remove_Linked_List_Elements
 */
package com.lc._203_Remove_Linked_List_Elements;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    ListNode removeElements(ListNode head, int val);
    
}
