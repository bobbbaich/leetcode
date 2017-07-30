package com.bobbbaich.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bpogo on 6/30/2017.
 */
public class SumOfTwoNum {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{0, -2, -3, 0}, -5);
        System.out.println();
    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> differences = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (differences.containsKey(number)) {
                return new int[]{differences.get(number), i};
            }
            differences.put(target - number, i);
        }
        return null;
    }
}
