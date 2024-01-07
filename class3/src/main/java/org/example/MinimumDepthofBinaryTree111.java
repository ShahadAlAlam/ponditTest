package org.example;

public class MinimumDepthofBinaryTree111 {
    static int minLevel = Integer.MAX_VALUE;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                                    new TreeNode(9),
                                    new TreeNode(20,
                                            new TreeNode(15),
                                            new TreeNode(7)
                                            )
                                    );
//        [2,null,3,null,4,null,5,null,6]
//        TreeNode root = new TreeNode(2,
//                                    null,
//                                    new TreeNode(3,
//                                           null,
//                                            new TreeNode(4,
//                                                    null,
//                                                    new TreeNode(5,
//                                                            null,
//                                                            new TreeNode(6)
//                                                    )
//                                            )
//                                    )
//        );
//        TreeNode root = new TreeNode(1,
//                                    new TreeNode(2,
//                                            new TreeNode(3,
//                                                    new TreeNode(4),new TreeNode(4)),
//                                            new TreeNode(3)),
//                                    new TreeNode(2));
//        [2,null,3,null,4,null,5,null,6]
//        root = new TreeNode(2,
//                        null,
//                            new TreeNode(3,
//                                    null,
//                                    new TreeNode(4,
//                                            null,
//                                            new TreeNode(5,
//                                                    null, new TreeNode(6)))));
                System.out.println(minDepth(root));
        System.out.println(minLevel);
    }
    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
//        int b = getPathCount(root,1);
        int b = getPathCount2(root);
        return b;
    }

    public static int getPathCount(TreeNode selectedNode,int curLevel){
        if(curLevel>minLevel){
            return curLevel;
        }
        if(selectedNode.left == null && selectedNode.right == null){
            if(curLevel<minLevel) minLevel = curLevel;
                return curLevel;
        } else if(selectedNode.left != null && selectedNode.right == null) {
            curLevel = getPathCount(selectedNode.left, curLevel+1);
        }
        else  if(selectedNode.left == null && selectedNode.right != null) {
            curLevel = getPathCount(selectedNode.right, curLevel+1);
        }
        else {
                int leftLevel = getPathCount(selectedNode.left, curLevel + 1 );
                int rightLevel = getPathCount(selectedNode.right, curLevel + 1);
                return Math.min(leftLevel,rightLevel);
        }
        return curLevel;
    }

    public static int getPathCount2(TreeNode selectedNode){
//        if(curLevel>minLevel){
//            return curLevel;
//        }
        if(selectedNode.left == null && selectedNode.right == null){
            //if(curLevel<minLevel) minLevel = curLevel;
            return 1;
        } else if(selectedNode.left != null && selectedNode.right == null) {
            return Math.min(minLevel,getPathCount2(selectedNode.left)+1) ;
        }
        else  if(selectedNode.left == null && selectedNode.right != null) {
            return getPathCount2(selectedNode.right)+1;
        }
        else {
            int leftLevel = getPathCount2(selectedNode.left );
            int rightLevel = getPathCount2(selectedNode.right);
            return Math.min(leftLevel,rightLevel)+1;
        }
//        return curLevel;
    }


}
