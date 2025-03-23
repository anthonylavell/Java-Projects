package ds.tree;

import ds.node.singly_node.TreeNode;

/*
Given the root of a binary tree and an integer targetSum, return true if the tree
has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 */
public class PathSum {
    public static void main(String[] args) {

    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left == null && root.right == null && root.val == targetSum){
            return true;
        }
        return (hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val));
    }

    public static int findPathSum(TreeNode root, int targetSum, int subTotal){
        Integer leftNode = (root.left!=null) ? findPathSum(root.left,targetSum,subTotal+root.left.val) : -1001;
        Integer rightNode =(root.right!=null) ? findPathSum(root.right,targetSum,subTotal+root.right.val) : -1001;
        if(leftNode == -1001 && rightNode== -1001){
            return subTotal;
        }

        return ((rightNode == -1001) || leftNode == targetSum) ? leftNode : rightNode;
    }
}
