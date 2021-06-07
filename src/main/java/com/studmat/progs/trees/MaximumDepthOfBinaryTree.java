package com.studmat.progs.trees;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int sum = 0;
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }
        int ldepth= maxDepth(root.left);
        int rdepth=  maxDepth(root.right);
        if(ldepth > rdepth){
           return ldepth +1;
        }else{
            return rdepth +1;
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left =new TreeNode(9);
        root.right = new TreeNode(2);

        //root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        //root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(1);
        MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
        System.out.println(obj.maxDepth(root));

    }

}













