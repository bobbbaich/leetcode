package com.bobbbaich.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                elements.add(nums[i][j]);
            }
        }

        if (r * c != elements.size()) {
            return nums;
        }

        int[][] result = new int[r][c];
        Iterator<Integer> iterator = elements.iterator();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c && iterator.hasNext(); j++) {
                result[i][j] = iterator.next();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ReshapeTheMatrix rtm = new ReshapeTheMatrix();
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rtm.matrixReshape(input, 3,3);
        System.out.println();
    }
}
