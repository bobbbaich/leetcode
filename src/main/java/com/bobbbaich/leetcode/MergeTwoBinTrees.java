//package com.bobbbaich.leetcode;
//
//
//import java.util.*;
//
//import static java.util.Arrays.asList;
//
//public class MergeTwoBinTrees {
//    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        if (t1 == null)
//            return t2;
//        if (t2 == null)
//            return t1;
//        t1.val += t2.val;
//        t1.left = mergeTrees(t1.left, t2.left);
//        t1.right = mergeTrees(t1.right, t2.right);
//        return t1;
//    }
//
//    private int bsf(Queue<TreeNode> queue, TreeNode goal, int position) {
//        if (queue.isEmpty()) return -1;
//        TreeNode node = queue.poll();
//        if (node.equals(goal)) return position;
//        if (node.left != null) queue.add(node.left);
//        if (node.right != null) queue.add(node.right);
//        return bsf(queue, goal, ++position);
//    }
//
//    private int dsf(Stack<TreeNode> stack, TreeNode goal, int position) {
//        if (stack.isEmpty()) return -1;
//        TreeNode node = stack.pop();
//        if (node.equals(goal)) return position;
//        if (node.left != null) stack.push(node.left);
//        if (node.right != null) stack.push(node.right);
//        return dsf(stack, goal, ++position);
//    }
//
//    public static void main(String[] args) {
//        MergeTwoBinTrees mtbt = new MergeTwoBinTrees();
//        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        TreeNode root = mtbt.getBinaryTree(values);
//        TreeNode root1 = mtbt.getBinaryTree(values);
//        TreeNode root2 = mtbt.getBinaryTree(values);
//
//        int bsf = mtbt.bsf(new LinkedList<>(asList(root)), new TreeNode(3), 0);
//
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        int dsf = mtbt.dsf(stack, new TreeNode(3), 0);
//
////        System.out.println("bsf: " + bsf);
////        System.out.println("dsf: " + dsf);
//
//        TreeNode treeNode = mtbt.mergeTrees(root1, root2);
//        System.out.println();
//    }
//
//    private TreeNode getBinaryTree(int[] values) {
//        if (values == null || values.length == 0)
//            throw new IllegalArgumentException("Given list of values is empty or null.");
//        List<TreeNode> nodes = new ArrayList<>();
//        for (int i = 0; i < values.length; i++) {
//            nodes.add(new TreeNode(values[i]));
//        }
//
//        for (int i = 0; i < nodes.size(); i++) {
//            TreeNode root = nodes.get(i);
//            if (i + i + 1 < nodes.size()) root.left = nodes.get(i + i + 1);
//            if (i + i + 2 < nodes.size()) root.right = nodes.get(i + i + 2);
//        }
//        return nodes.get(0);
//    }
//
//    private static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            TreeNode treeNode = (TreeNode) o;
//
//            return val == treeNode.val;
//        }
//
//        @Override
//        public int hashCode() {
//            return val;
//        }
//    }
//}
//
//
