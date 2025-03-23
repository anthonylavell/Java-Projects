package code_patterns.dfs;

import ds.node.singly_node.TreeNode;

public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftNode = maxDepth(root.left);
        int rightNode = maxDepth(root.right);
        return (Math.max(leftNode,rightNode) +1);
    }
}
