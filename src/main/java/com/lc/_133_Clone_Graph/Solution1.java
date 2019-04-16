/**
 * Leetcode - _133_Clone_Graph
 */
package com.lc._133_Clone_Graph;
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

    public Node cloneGraph(Node node) {

        Map<Node, Node> m = new HashMap<>();
        return helper(node, m);
    }

    Node helper(Node node, Map<Node, Node> m){
        if(node == null) return null;
        if(m.containsKey(node)) return m.get(node);

        Node clone = new Node(node.val);
        m.put(node, clone);
        for(Node neighbor: node.neighbors){
            clone.neighbors.add(helper(neighbor, m));
        }
        return clone;
    }
}
