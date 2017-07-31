package com.bobbbaich.leetcode.binary;

public class ConstructStringFromBinaryTree extends AbstractBinary {
    private static final String OPEN_PAR = "(";
    private static final String CLOSE_PAR = ")";

    public String tree2str(TreeNode t) {
        StringBuilder res = new StringBuilder();
        analyse(t, res);
        return res.toString();
    }

    private void analyse(TreeNode t, StringBuilder res) {
        if (t == null) return;
        res.append(t.val);


        if (t.left == null && t.right == null) return;


        res.append(OPEN_PAR);
        analyse(t.left, res);
        res.append(CLOSE_PAR);
        if (t.right != null) {
            res.append(OPEN_PAR);
            analyse(t.right, res);
            res.append(CLOSE_PAR);
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};

        ConstructStringFromBinaryTree csfbt = new ConstructStringFromBinaryTree();

        TreeNode node = csfbt.getBinaryTree(values);
        System.out.println(csfbt.tree2str(node));
    }
}
