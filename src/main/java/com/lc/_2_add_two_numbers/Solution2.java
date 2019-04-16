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
class Solution2 implements Solution {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode curr = res;

        int carry = 0;
        while(l1 != null || l2 != null){
            int num1 = 0, num2 = 0;
            if(l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode((num1 + num2 + carry) % 10);
            carry = (num1 + num2 + carry) / 10;

            curr = curr.next;
        }

        return res.next;
    }
}
