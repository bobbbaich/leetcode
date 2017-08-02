package com.bobbbaich.leetcode.binary;

public class InvertBinaryTree extends AbstractBinary {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode buffer = root.left;
            root.left = root.right;
            root.right = buffer;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }


    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        InvertBinaryTree mdobt = new InvertBinaryTree();
        TreeNode binaryTree = mdobt.getBinaryTree(values);
        mdobt.invertTree(binaryTree);
        System.out.println();
    }
}
