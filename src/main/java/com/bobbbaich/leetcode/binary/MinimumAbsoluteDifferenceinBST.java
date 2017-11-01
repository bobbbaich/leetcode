package com.bobbbaich.leetcode.binary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceinBST extends AbstractBinary {
    public int getMinimumDifference(TreeNode root) {
        int result = Integer.MAX_VALUE;
        List<Integer> values = new ArrayList<>();
        getMinimumDifference(values, root);
        Collections.sort(values);

        for (int i = 1; i != values.size(); i++) {
            int i1 = values.get(i) - values.get(i - 1);
            result = Math.min(result, i1);
        }

        return result;
    }

    public void getMinimumDifference(List<Integer> integers, TreeNode root) {
        if (root == null) return;
        integers.add(root.val);

        getMinimumDifference(integers, root.left);
        getMinimumDifference(integers, root.right);
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 25, 6, 7, 8, 9};

        MinimumAbsoluteDifferenceinBST aolbt = new MinimumAbsoluteDifferenceinBST();
        TreeNode node = aolbt.getBinaryTree(values);
        int result = aolbt.getMinimumDifference(node);
        System.out.println("result: " + result);

    }
}
