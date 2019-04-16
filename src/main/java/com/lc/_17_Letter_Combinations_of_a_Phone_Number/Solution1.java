/**
 * Leetcode - _17_Letter_Combinations_of_a_Phone_Number
 */
package com.lc._17_Letter_Combinations_of_a_Phone_Number;
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

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<String>();
        if(digits == null || digits.isEmpty()) return res;

        Map<Character, String> m = new HashMap<>();
        m.put('2', "abc");
        m.put('3', "def");
        m.put('4', "ghi");
        m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7', "pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");

        dfs(res, "", digits, 0, m);

        return res;
    }

    private void dfs(List<String> res, String currRes, String digits, int currDigitIndex, Map<Character, String> m){

        if(currRes.length() == digits.length()){
            res.add(currRes);
            return;
        }

        if(currDigitIndex >= digits.length()) return;

        String choices = m.get(digits.charAt(currDigitIndex));

        for(int i = 0; i < choices.length(); i++){
            currRes += choices.charAt(i);
            dfs(res, currRes, digits, currDigitIndex++, m);
            currRes = currRes.substring(0, currRes.length() - 1);
        }
    }



}
