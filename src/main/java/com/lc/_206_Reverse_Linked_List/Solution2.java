/**
 * Leetcode - _206_Reverse_Linked_List
 */
package com.lc._206_Reverse_Linked_List;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution2 implements Solution {

    //recursive
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode p = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return p;

    }



}
