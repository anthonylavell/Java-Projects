package grinder.tree;

import ds.node.singly_node.TreeNode;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

    }
    public static boolean isValidBST(TreeNode root) {
            return findValidBST(root,-2147483649l,2147483648l);
    }

    public static boolean findValidBST(TreeNode root, long min, long max) {
        if(root == null){
            return true;
        }
        if(min > root.val || root.val > max){
            return false;
        }
        return findValidBST(root.left,min, root.val) && findValidBST(root.right, root.val, max);
    }
}
