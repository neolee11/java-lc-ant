/**
 * Leetcode - _21_Merge_Two_Sorted_Lists
 */
package com.lc._21_Merge_Two_Sorted_Lists;
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(-1);
        ListNode cur = res;

        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    cur.next = l1;
                    l1 = l1.next;
                }
                else {
                    cur.next = l2;
                    l2 = l2.next;
                }
                cur = cur.next;
            }
            else if(l1 != null && l2 == null){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }

        return res.next;
    }

}
