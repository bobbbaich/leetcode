package com.bobbbaich.leetcode;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        return -1;
    }

    public static void main(String[] args) {
        int[][] field = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};

        IslandPerimeter ip = new IslandPerimeter();
        System.out.println(ip.islandPerimeter(field));
    }
}
