package com.bobbbaich.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bopo0717 on 7/21/2017.
 */
public class HammingDistance {
    private static final int NUMBER_SYSTEM = 2;

    public int hammingDistance(int x, int y) {
        int result = 0;
        List<Integer> binX = intToBinary(x);
        List<Integer> binY = intToBinary(y);

        int size = binX.size();
        if (size < binY.size()) {
            size = binY.size();
            binX.addAll(new LinkedList<>(Collections.nCopies(size - binX.size(), 0)));
        } else {
            binY.addAll(new LinkedList<>(Collections.nCopies(size - binY.size(), 0)));
        }

        for (int i = 0; i < size; i++) {
            Integer a = binX.get(i);
            Integer b = binY.get(i);
            if (a != b) result++;
        }

        return result;
    }

    private List<Integer> intToBinary(int decimal) {
        return intToBinary(decimal, new LinkedList<>());
    }

    private List<Integer> intToBinary(int decimal, List<Integer> binary) {
        binary.add(decimal % NUMBER_SYSTEM);
        int result = decimal / NUMBER_SYSTEM;
        if (result != 0) return intToBinary(result, binary);
        return binary;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        int x = 3;
        int y = 1;

        List<Integer> intX = hammingDistance.intToBinary(x);
        for (Integer integer : intX) {
            System.out.printf("%s", integer);
        }
        System.out.println();

        List<Integer> intY = hammingDistance.intToBinary(y);
        for (Integer integer : intY) {
            System.out.printf("%s", integer);
        }
        System.out.println();

        System.out.println(hammingDistance.hammingDistance(x, y));
    }
}
