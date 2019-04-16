/**
 * Leetcode - _76_Minimum_Window_Substring
 */
package com.lc._76_Minimum_Window_Substring;
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

    public String minWindow(String s, String t) {
        String res = "";
        int i = 0, j = 0;
        Map<Character, Integer> tMap = toMap(t);

        while(i < s.length() && j < s.length())
        {
            String currStr = s.substring(i, j+1);
            if(containAllLetter(currStr, tMap)){
                if(res.length() > 0 && res.length() > currStr.length()){
                    res = currStr;
                }
                else {
                    res = currStr;
                }

                i++;
            }
            else {
                j++;
            }
        }

        return res;
    }

    private Map<Character, Integer> toMap(String s){
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++) {
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), sMap.get(s.charAt(i) + 1));
            }
            else{
                sMap.put(s.charAt(i), 1);
            }
        }

        return sMap;
    }

    private boolean containAllLetter(String s, Map tMap){
        Map<Character, Integer> sMap = toMap(s);

        Iterator it = tMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
//            System.out.println(pair.getKey() + " = " + pair.getValue());
            if(!sMap.containsKey(pair.getKey()) || sMap.get(pair.getKey()) != pair.getValue()) return false;
            it.remove(); // avoids a ConcurrentModificationException
        }

        return true;
    }

//    private boolean containAllLetter(String s, String t){
//        for(int i = 0; i < t.length(); i++){
//            if(s.indexOf(t.charAt(i)) < 0) return false;
//        }
//
//        return true;
//    }

}
