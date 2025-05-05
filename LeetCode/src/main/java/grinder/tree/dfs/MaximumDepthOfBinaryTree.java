package grinder.tree.dfs;

import ds.node.singly_node.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    public static int maxDepth2(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftN = maxDepth2(root.left);
        int rightN = maxDepth2(root.right);
        return Math.max(leftN,rightN) + 1;
    }
}
