package org.example;
import org.example.TreeNode;

public class BalancedBinaryTree110 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(9,
                                    new TreeNode(9),
                                    new TreeNode(20,
                                            new TreeNode(15),
                                            new TreeNode(7)
                                            )
                                    );
//        TreeNode root = new TreeNode(1,
//                                    new TreeNode(2,
//                                            new TreeNode(3,
//                                                    new TreeNode(4),new TreeNode(4)),
//                                            new TreeNode(3)),
//                                    new TreeNode(2));
                System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        System.out.println(Math.abs(getChlidCount(root.left)-getChlidCount(root.right)));
        return Math.abs(getChlidCount(root.left)-getChlidCount(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    public static int getChlidCount(TreeNode selectedNode){
        if(selectedNode == null){
            return 0;
        }
        return 1+Math.max(getChlidCount(selectedNode.left),getChlidCount(selectedNode.right));
    }
}
