package com.studmat.progs.trees;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return isBst(root);
    }
    public TreeNode pre=null;
    public boolean isBst(TreeNode root){
        if(root == null) return true;
        boolean left = isBst(root.left);
        if(!left) return false;

        if(pre != null && pre.val >= root.val) return false;
        pre=root;

        boolean right = isBst(root.right);
        if(!right) return false;

        return true;
    }
//    public boolean validate(TreeNode root, Integer low, Integer high) {
//        // Empty trees are valid BSTs.
//        if (root == null) {
//            return true;
//        }
//        // The current node's value must be between low and high.
//        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
//            return false;
//        }
//        // The left and right subtree must also be valid.
//        return validate(root.left, low, root.val) &&  validate(root.right, root.val, high);
//    }
//
//    public boolean isValidBST(TreeNode root) {
//        return validate(root, null, null);
//    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left =new TreeNode(8);
        root.right = new TreeNode(15);
//
       root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(17);
       root.right.left.left = new TreeNode(12);
       root.right.left.right = new TreeNode(14);

       //root.right.left.left.left = new TreeNode(9);
        ValidBST obj = new ValidBST();
        System.out.println(obj.isValidBST(root));

    }
}
