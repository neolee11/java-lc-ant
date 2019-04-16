/**
 * Leetcode - _203_Remove_Linked_List_Elements
 */
package com.lc._203_Remove_Linked_List_Elements;
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

    /*Remove all elements from a linked list of integers that have value val.

            Example:

    Input:  1->2->6->3->4->5->6, val = 6
    Output: 1->2->3->4->5*/

    public ListNode removeElements(ListNode head, int val) {

        ListNode res = new ListNode(-1);
        ListNode cur = res;
        cur.next = head;

        while(cur != null && cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }

        return res.next;
    }

}
