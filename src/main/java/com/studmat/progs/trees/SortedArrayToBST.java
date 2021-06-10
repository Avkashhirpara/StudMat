package com.studmat.progs.trees;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int mIndex = nums.length/2;
        TreeNode root = new TreeNode(nums[mIndex]);
        TreeNode dummy = new TreeNode(0);
        dummy.left = root;
        for (int i = mIndex+1; i < nums.length; i++) {
                root.right= new TreeNode(nums[i]);
                root = root.right;
        }
        root= dummy.left;
        for (int i = mIndex-1; i >= 0; i--) {
            root.left= new TreeNode(nums[i]);
            root = root.left;
        }

        return dummy.left;
    }

    public static void main(String[] args) {
        int[] nums  = new int[]{};
        TreeNode root =new SortedArrayToBST().sortedArrayToBST(nums);
                root.print();
    }

}
