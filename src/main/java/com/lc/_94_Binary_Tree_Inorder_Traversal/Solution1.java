/**
 * Leetcode - _94_Binary_Tree_Inorder_Traversal
 */
package com.lc._94_Binary_Tree_Inorder_Traversal;
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

    //recursive
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res){

        if(root == null) return;

        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);
    }

}
