package ds.tree.dfs;

import ds.node.singly_node.TreeNode;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

    }

    public static boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;

        return findValidBST(root,min,max);
    }

    private static boolean findValidBST(TreeNode root,long min, long max){
        if (root == null || (root.left == null && root.right == null)){
            return true;
        }
        if (root.val <= min || root.val >= max){
            return false;
        }
        return findValidBST(root.left,min, root.val) && findValidBST(root.right, root.val, max);
    }
}
