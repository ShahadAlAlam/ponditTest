package org.example;

import com.sun.source.tree.Tree;

import java.util.Arrays;

public class MaximumPathSum124 {

    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {
//        [1,2,3]
//        TreeNode left = new TreeNode(2);
//        TreeNode right = new TreeNode(3);
//        TreeNode root = new TreeNode(1,left,right);

//        [-10,9,20,null,null,15,7]
//        TreeNode childLeft = new TreeNode(15);
//        TreeNode childRight = new TreeNode(7);
//        TreeNode parentRootRight = new TreeNode(20,left,right);
//        TreeNode left = new TreeNode(9);
//        TreeNode root = new TreeNode(-10,left,parentRootRight);

        TreeNode root = new TreeNode(-10,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        int i = getMaxSum(root);
        System.out.println("Max profit is = "+maxSum);

    }

    public static int getMaxSum(TreeNode selectedNode) {
        if(selectedNode == null){
            return 0;
        }

        int leftMax = Math.max(0,getMaxSum(selectedNode.left));
        int rightMax = Math.max(0,getMaxSum(selectedNode.right));
        int currentSum = selectedNode.val + leftMax + rightMax;
        maxSum = Math.max(currentSum,maxSum);
        return Math.max (selectedNode.val+leftMax,selectedNode.val+rightMax);
    }
  public static class TreeNode {
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
  }
}
