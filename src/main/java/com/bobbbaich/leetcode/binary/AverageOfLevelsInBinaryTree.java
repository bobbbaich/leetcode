package com.bobbbaich.leetcode.binary;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelsInBinaryTree extends AbstractBinary {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        average(root, 0, result, count);
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) / count.get(i));
        }
        return result;
    }

    private void average(TreeNode node, int i, List<Double> res, List<Integer> count) {
        if (node == null) return;
        if (i < count.size()) {
            res.set(i, res.get(i) + (double) node.val);
            count.set(i, count.get(i) + 1);
        } else {
            res.add(1.0 * node.val);
            count.add(1);
        }
        i++;
        average(node.left, i, res, count);
        average(node.right, i, res, count);
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        AverageOfLevelsInBinaryTree aolbt = new AverageOfLevelsInBinaryTree();
        TreeNode node = aolbt.getBinaryTree(values);
        List<Double> doubles = aolbt.averageOfLevels(node);
        for (int i = 0; i < doubles.size(); i++) {
            System.out.printf("Level %s -> %.2f\n", i, doubles.get(i));
        }

    }
}
