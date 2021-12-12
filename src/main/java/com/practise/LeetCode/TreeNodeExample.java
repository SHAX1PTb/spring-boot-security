package com.practise.LeetCode;



public class TreeNodeExample {

    public boolean isSameTreeNode(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {

            return false;
        }


        if (p.val != q.val){
            return false;
        }

        return isSameTreeNode(p.right,p.right) && isSameTreeNode(p.left,q.left);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
