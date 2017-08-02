package com.bobbbaich.leetcode.binary;

public class MaximumDepthOfBinaryTree extends AbstractBinary {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        depth++;
        int leftDepth = maxDepth(root.left, depth);
        int rightDepth = maxDepth(root.right, depth);
        return leftDepth < rightDepth ? rightDepth : leftDepth;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        MaximumDepthOfBinaryTree mdobt = new MaximumDepthOfBinaryTree();
        TreeNode binaryTree = mdobt.getBinaryTree(values);
        System.out.println(mdobt.maxDepth(binaryTree));
    }
}
