/**
 * Leetcode - add_two_numbers
 */
package com.lc.add_two_numbers;
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(-1);
        ListNode curr = res;
        int carry = 0;

        while(l1 != null || l2 != null){
            int a = 0, b = 0;

            if(l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            int sum = a + b + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return res.next;
    }

}
