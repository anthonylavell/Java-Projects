package ds.tree;

import ds.node.singly_node.TreeNode;

public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {

    }
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftNode = maxDepth(root.left);
        int rightNode = maxDepth(root.right);
        return (Math.max(leftNode,rightNode)) + 1;

    }
}
