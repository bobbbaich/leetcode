package com.bobbbaich.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsString3 {
    public String reverseWords(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        List<String> strings = Arrays.asList(reversed.split(" "));
        Collections.reverse(strings);
        String result = strings.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(" "));

        return result;
    }

    public static void main(String[] args) {
        ReverseWordsString3 rws = new ReverseWordsString3();
        System.out.println(rws.reverseWords("qwerty asdfg xyz"));
    }
}
