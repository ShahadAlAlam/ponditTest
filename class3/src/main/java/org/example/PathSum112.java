package org.example;

public class PathSum112 {
    static boolean isFound = false;

    public static void main(String[] args) {
//        [5,4,8,11,null,13,4,7,2,null,null,null,1]
//        22
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7), new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, null, new TreeNode(1))
                )
        );

        root = new TreeNode(1,new TreeNode(2), new TreeNode(3));
        root = new TreeNode();
        root = new TreeNode(1);
        System.out.println(getPathSum(root, 1, 0));
        System.out.println(isFound);
    }

    public void staticCheck(){
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7), new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, null, new TreeNode(1))
                )
        );
        System.out.println(getPathSum(root, 1, 0));

    }
    public static boolean getPathSum(TreeNode selectedNode, int targetSum, int parentSum) {
        if( selectedNode == null){
            return false;
        }
        if (isFound) {
            return true;
        }
        if (selectedNode.left == null && selectedNode.right == null) {
            if (targetSum == parentSum + selectedNode.val) {
                isFound = true;
            } else if (isFound)
                return true;
            else
                return false;
        } else if (selectedNode.left != null && selectedNode.right == null) {
            return getPathSum(selectedNode.left, targetSum, parentSum + selectedNode.val);
        } else if (selectedNode.left == null && selectedNode.right != null) {
            return getPathSum(selectedNode.right, targetSum, parentSum + selectedNode.val);
        } else {
            boolean leftLevel = getPathSum(selectedNode.left, targetSum, parentSum + selectedNode.val);
            boolean rightLevel = getPathSum(selectedNode.right, targetSum, parentSum + selectedNode.val);
            return (leftLevel || rightLevel);
        }
        return isFound;
    }

}
