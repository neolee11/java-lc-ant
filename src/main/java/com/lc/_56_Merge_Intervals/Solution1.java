/**
 * Leetcode - _56_Merge_Intervals
 */
package com.lc._56_Merge_Intervals;

import java.util.*;

import com.ciaoshen.leetcode.util.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution1 implements Solution {

    public List<Interval> merge(List<Interval> intervals) {

        Collections.sort(intervals, new SortInterval());

        List<Interval> res = new ArrayList<Interval>();

        for(Interval interval: intervals){
            if(res.size() == 0){
                res.add(interval);
            }
            else{
                Interval lastInt = res.get(res.size() - 1);
                if(interval.start <= lastInt.end && interval.end >= lastInt.start){
                    lastInt.end = Math.max(interval.end, lastInt.end);
                }
                else {
                    res.add(interval);
                }
            }

        }
        return res;

    }

    class SortInterval implements Comparator<Interval>{

        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }


}
