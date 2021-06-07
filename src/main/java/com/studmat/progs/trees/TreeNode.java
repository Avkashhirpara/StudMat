package com.studmat.progs.trees;

public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode createTree(int[] ints){
            TreeNode root = new TreeNode(ints[0]);
            TreeNode tempNode = root;
            for (int i = 1; i < ints.length; i++) {
                root.left = new TreeNode(ints[i]);
                root.right = new TreeNode(ints[i]);

            }
        return null;
        }
}
