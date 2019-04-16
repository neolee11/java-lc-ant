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
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution1 implements Solution {

    /*Reverse a singly linked list.

    Example:

    Input: 1->2->3->4->5->NULL
    Output: 5->4->3->2->1->NULL
    Follow up:

    A linked list can be reversed either iteratively or recursively. Could you implement both?
    */
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode tmp;

        while(head != null){
            tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }

        return pre;
    }

}
