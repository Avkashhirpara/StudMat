package com.studmat.progs.trees;

import java.util.HashMap;
import java.util.Map;

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
        int newlevel = 3;
        Map<Integer,String> map = new HashMap<Integer,String>();
        public void print(){
            map.put(1,this.val+"");
            String str = "";
            if(this.left != null){
                str += this.left.val;
            }
            if(this.right != null){
                str += this.right.val;
            }
            map.put(2,str);
           printBranch(this.left,3);
           printBranch(this.right,3);
            for (int i = 1; i <= newlevel; i++) {
                System.out.println(map.get(i));
            }

        }
        private void printBranch(TreeNode root, int level){
            if(root== null){
                return;
            }
            if(this.newlevel != level){
                this.newlevel = level;
            }

            String str = "";
            if(root.left != null){
                str += root.left.val;
            }else{
                str+=" ";
            }
            if(root.right != null){
                str += root.right.val;
            }else{
                str+=" ";
            }
           if(map.get(level) != null){
               map.put( level,(map.get(level).toString()+ str));
           }else{
               map.put( level,str);
           }
            printBranch(root.left,level+1);
            printBranch(root.right,level+1);
        }
}
