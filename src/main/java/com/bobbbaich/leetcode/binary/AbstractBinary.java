package com.bobbbaich.leetcode.binary;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinary {
    public TreeNode getBinaryTree(int[] values) {
        if (values == null || values.length == 0)
            throw new IllegalArgumentException("Given list of values is empty or null.");
        List<TreeNode> nodes = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            nodes.add(new TreeNode(values[i]));
        }

        for (int i = 0; i < nodes.size(); i++) {
            TreeNode root = nodes.get(i);
            if (i + i + 1 < nodes.size()) root.left = nodes.get(i + i + 1);
            if (i + i + 2 < nodes.size()) root.right = nodes.get(i + i + 2);
        }
        return nodes.get(0);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
