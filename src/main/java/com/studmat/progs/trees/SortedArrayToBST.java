package com.studmat.progs.trees;

import sun.reflect.generics.tree.Tree;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return new TreeNode();
        }
        TreeNode root = new TreeNode();
        int begin = 0;
        int end = nums.length - 1;
        int mid = (begin + end) / 2;

        root.val = nums[mid];
        root.left = sortArray(nums, begin, mid - 1);
        root.right = sortArray(nums, mid + 1, end);
        return root;
    }

    private TreeNode sortArray( int[] nums, int begin, int end) {
        if (begin > end) {
            return null;
        }
        int mid = (begin + end) / 2;
        TreeNode  root = new TreeNode(nums[mid]);
        root.left = sortArray(nums, begin, mid - 1);
        root.right = sortArray( nums, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1, 2, 3, 4, 5, 6, 7};
        TreeNode root = new SortedArrayToBST().sortedArrayToBST(nums);
        root.print();
        // System.out.println(2/2);
    }

}
