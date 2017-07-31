package com.bobbbaich.leetcode;

/**
 * Created by bopo0717 on 7/21/2017.
 */
public class ReverseString {

    public String reverseString(String string) {
        return new StringBuffer(string).reverse().toString();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("qwerty"));
    }
}
