package com.bobbbaich.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> elems = new TreeMap<>();
        for (int num : nums) {
            if (elems.containsKey(num)) elems.put(num, elems.get(num) + 1);
            else elems.put(num, 1);
        }

        int result = -1;
        for (Integer e : elems.keySet()) {
            if (elems.getOrDefault(result, -1) < elems.get(e)) result = e;
        }

        return result;
    }


    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] ints = {3, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = me.majorityElement(ints);
        System.out.println();
    }
}
