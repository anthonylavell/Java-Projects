package grinder.tree.dfs;

import ds.node.CreateTreeNode;
import ds.node.singly_node.TreeNode;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        int [] num = {3,9,20,15,7};
        TreeNode root = CreateTreeNode.insert(num);
        isBalanced(root);
    }

    public static boolean isBalanced(TreeNode root) {
        return (findTreeLevel(root) >= 0);
    }

    private static int findTreeLevel(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftNode = findTreeLevel(root.left);
        int rightNode = findTreeLevel(root.right);

        if((leftNode < 0 || rightNode < 0) ||  Math.abs(leftNode-rightNode) > 1){
            return -1;
        }
        return (Math.max(leftNode,rightNode)) +1;
    }
}
