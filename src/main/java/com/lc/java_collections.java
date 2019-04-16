package com.forefront;

import java.util.*;

/**

 Array sort
 Collection sort, Iterator

 List: ArrayList (common), LinkedList

 Set: HashSet, EnumSet
 SortedSet / NavigableSet: TreeSet

 Queue: ArrayDeque
 Deque: ArrayDeque, PriorityQueue, LinkedList (should use ArrayDeque instead)
 Stack: Stack (deprecated, should use ArrayDeque instead)

 Map: HashMap, LinkedHashMap, EnumMap
 SortedMap: TreeMap
 */

public class java_collections {

    public static void test() {

        List<Integer> listInt = new ArrayList<>();

        Set<String> strSet = new HashSet<>();
        strSet.add("test");
        strSet.add("test");

        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.add("test");
        navigableSet.add("test1");
        navigableSet.add("test2");
        navigableSet.descendingSet();

        Queue<Integer> testPrioDeque = new PriorityQueue<>();
        Deque<Integer> testArrayDeque = new ArrayDeque<>();

        Stack<Integer> testStack = new Stack<>();

        Map<Integer, String> testMap = new HashMap<>();
        Iterator it = testMap.entrySet().iterator();

        TreeMap<Integer, String> testTreeMap = new TreeMap<>();
        Map<Integer, String> testTreeMapA = new LinkedHashMap<Integer, String>();
//        testTreeMap.put();
    }

}
