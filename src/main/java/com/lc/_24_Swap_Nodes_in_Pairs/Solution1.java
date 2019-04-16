/**
 * Leetcode - _24_Swap_Nodes_in_Pairs
 */
package com.lc._24_Swap_Nodes_in_Pairs;
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
class Solution1 implements Solution {

    public ListNode swapPairs(ListNode head) {

        //find a pair
        if(head == null || head.next == null) return head;

        ListNode curr = swapPairs(head.next.next);

        //swaping
        head.next.next = head;
        head.next = curr;

        return head;

    }

}
