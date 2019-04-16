/**
 * Leetcode - _99_Recover_Binary_Search_Tree
 */
package com.lc._99_Recover_Binary_Search_Tree;
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

    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        if(root == null) return;
        helper(root);
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }

    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);

        if(prev != null && prev.val >= root.val) {
            if (first == null) first = prev;
            second = root;
        }

        prev = root;
        helper(root.right);

    }

}
