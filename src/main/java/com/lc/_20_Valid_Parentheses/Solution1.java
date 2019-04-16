/**
 * Leetcode - _20_Valid_Parentheses
 */
package com.lc._20_Valid_Parentheses;
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

    public boolean isValid(String s){
        if(s.length() == 0) return true;

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i< s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr ==  '['){
                stack.push(curr);
            }
            else if (curr == ')'){
                if(stack.empty() || stack.pop() != '(') return false;
            }
            else if(curr == '}' ){
                if(stack.empty() || stack.pop() != '{') return false;
            }
            else if(curr ==  ']'){
                if(stack.empty() || stack.pop() != '[') return false;
            }
            else return false;
        }

        return stack.empty();
    }

}
