package com.bobbbaich.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bopo0717 on 7/21/2017.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) result.add("FizzBuzz");
            else if (i % 3 == 0) result.add("Fizz");
            else if (i % 5 == 0) result.add("Buzz");
            else result.add("" + i);
        }

        return result;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        List<String> strings = fb.fizzBuzz(15);
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
