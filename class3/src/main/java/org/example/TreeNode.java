package org.example;

public class TreeNode {
    int val;
    final TreeNode left;
    final TreeNode right;

    public TreeNode() {
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public boolean isNotEmpty() {
        Object o = this;
        if (this != null) return true;
        return false;
    }

    @Override
    public String toString() {
        if (this!=null)
        return "TreeNode{" +
                "val=" + val +
                ", left ="+(left!=null? left.toString():"{}")+" " +
                ", right ="+(right!=null? right.toString():"{}")+"}";
        else
            return "TreeNode{}";

    }
}