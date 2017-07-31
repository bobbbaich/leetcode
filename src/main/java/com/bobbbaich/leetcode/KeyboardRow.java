package com.bobbbaich.leetcode;

import java.util.*;

/**
 * Created by bopo0717 on 7/21/2017.
 */
public class KeyboardRow {

    private static Set<String> QWERTY = new HashSet<>(Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p"));
    private static Set<String> ASDFG = new HashSet<>(Arrays.asList("a", "s", "d", "f", "g", "h", "j", "k", "l"));
    private static Set<String> ZXCVB = new HashSet<>(Arrays.asList("z", "x", "c", "v", "b", "n", "m"));


    public String[] findWords(String[] words) {
        List<String> result = new LinkedList<>();
        for (String word : words) {
            if (word == null || word.length() == 0) break;
            String letter = String.valueOf(word.charAt(0)).toLowerCase();
            if (QWERTY.contains(letter)) {
                if (isFromRow(QWERTY, word)) result.add(word);
            } else if (ASDFG.contains(letter)) {
                if (isFromRow(ASDFG, word)) result.add(word);
            } else if (ZXCVB.contains(letter)) {
                if (isFromRow(ZXCVB, word)) result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    private boolean isFromRow(Set<String> row, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!row.contains(String.valueOf(word.charAt(i)).toLowerCase())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        KeyboardRow kr = new KeyboardRow();
        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        String[] output = kr.findWords(input);
        for (String s : output) {
            System.out.println(s);
        }

    }
}
