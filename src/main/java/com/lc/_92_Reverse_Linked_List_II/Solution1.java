/**
 * Leetcode - _92_Reverse_Linked_List_II
 */
package com.lc._92_Reverse_Linked_List_II;
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

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(head == null || head.next == null) return head;

        ListNode origHead = head;
        ListNode preStart = null;
        ListNode pre = null;
        int index = 1;

        while (index < m && head != null){
            pre = head;
            head = head.next;
            index++;
        }

        preStart = pre;
        ListNode startHead = head;
        pre = null;

        while(index <= n && head != null){
            ListNode tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
            index++;
        }

        ListNode res = null;
        if(preStart == null){
            startHead.next = head;
            res = pre;
        }
        else {
            preStart.next = pre;
            startHead.next = head;
            res = origHead;
        }


        return res;
    }

}
