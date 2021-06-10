package com.studmat.progs.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = null;
        if (root == null) {
            return list;
        } else {
            sublist = new ArrayList<>();
            sublist.add(root.val);
            list.add(sublist);
        }
        sublist = new ArrayList<>();
        if (root.left != null) {
            sublist.add(root.left.val);
        }
        if (root.right != null) {
            sublist.add(root.right.val);
        }
        if (sublist.isEmpty()) {
            return list;
        } else {
            list.add(sublist);
        }
        appendOrderLevelInList(root.left, 2, list);
        appendOrderLevelInList(root.right, 2, list);

        return list;
    }

    int newlevel = 1;

    private void appendOrderLevelInList(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        List<Integer> sublist = null;
        if (this.newlevel < level) {
            this.newlevel = level;
            sublist = new ArrayList<>();
            list.add(sublist);
        } else {
            sublist = list.get(level);
        }
        if (root.left != null) {
            sublist.add(root.left.val);
        }
        if (root.right != null) {
            sublist.add(root.right.val);
        }

        appendOrderLevelInList(root.left, level + 1, list);
        appendOrderLevelInList(root.right, level + 1, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(14);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(13);
//                    root.right.left.left = new TreeNode(12);
//                    root.right.left.right = new TreeNode(14);
        root.right.right = new TreeNode(17);
        //    root.right.right.left = new TreeNode(18);
        root.right.right.right = new TreeNode(19);

        LevelOrder obj = new LevelOrder();
        System.out.println(new Solution().levelOrder(root));
    }


    public void queueExample() {
        Queue<Integer> queue = new LinkedList<>();
    }

}
// without recursion.

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();

        if (root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int noOfNodes = queue.size();

            List<Integer> curValues = new LinkedList<>();

            for (int i = 0; i < noOfNodes; i++) {
                TreeNode node = queue.poll();

                curValues.add(node.val);

                if (node.left != null) queue.offer(node.left);

                if (node.right != null) queue.offer(node.right);
            }

            ans.add(curValues);
        }

        return ans;
    }
}
