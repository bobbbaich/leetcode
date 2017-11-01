package com.bobbbaich.leetcode;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (char nextMove : moves.toCharArray()) {
            switch (nextMove) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                default:
                    break;
            }
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        JudgeRouteCircle judgeRouteCircle = new JudgeRouteCircle();
        System.out.println(judgeRouteCircle.judgeCircle("UDLRULDRLUD"));
    }
}
